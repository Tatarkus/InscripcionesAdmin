/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import entities.Clase;
import entities.Horario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import models.ClaseFacade;
import models.HorarioFacade;
import models.RamoFacade;
import models.SeccionFacade;

/**
 *
 * @author matia
 */

@Named(value = "horarioBean") 
@SessionScoped
public class HorarioBean implements Serializable{

    /**
     * Creates a new instance of HorarioBean
     */
    
    @EJB HorarioFacade horario;
    @EJB RamoFacade ramo;
    @EJB SeccionFacade seccion;
    @EJB ClaseFacade clase;
    

    List<String> clases = new ArrayList<>();
    
    public HorarioBean (){
    }
    public void obtenerHorario(int run) {
        
        String[][] sinoptico  = new String[14][6];
        String data;
        int dia=0, bloque=0;
        
        for (int i = 0; i <= 13 ; i++) {
            Arrays.fill( sinoptico[i],"---");
        }
        
        System.out.println("Buscando horario del run: "+run);
        
        List<Horario> horarioUsuario = horario.findAll();
        for (Horario horario1 : horarioUsuario) {
            if (horario1.getUsuariorun().getRun()==run) {
                                System.out.println("id: "+ horario1.getCodHorario());

                System.out.println("Encontrada una clase de: "+ horario1.getClasecodclase().getSeccioncodseccion().getRamosigla().getNomRamo());
                System.out.println("Dia: "+horario1.getClasecodclase().getDia() + " Bloque: "+ horario1.getClasecodclase().getBloquecodbloque().getCodBloque()); 

                data=horario1.getClasecodclase().getSeccioncodseccion().getRamosigla().getSigla();
                data+="\n";
                data+=horario1.getClasecodclase().getSala();
                switch(horario1.getClasecodclase().getDia())
                {
                    case "Lunes":
                        dia = 0;
                        break;
                        case "Martes":
                        dia = 1;
                        break;
                        case "Miercoles":
                        dia = 2;
                        break;
                        case "Jueves":
                        dia = 3;
                        break;
                        case "Viernes":
                        dia = 4;
                        break;
                        case "Sabado":
                        dia = 5;
                        break;
                }
                bloque=horario1.getClasecodclase().getBloquecodbloque().getCodBloque()-1 ;
               
                //List<String> clases_dia = new ArrayList<>();
                sinoptico[bloque][dia] = data;
                
            }

           
        }               
           clases = twoDArrayToList(sinoptico);
                  
    }

    public List<String> getClases() {
        return clases;
    }

    public void setClases(List<String> clases) {
        this.clases = clases;
    }
    
    public <T> List<T> twoDArrayToList(T[][] twoDArray) {
    List<T> list = new ArrayList<>();
    for (T[] array : twoDArray) {
        list.addAll(Arrays.asList(array));
    }
    return list;
}
}

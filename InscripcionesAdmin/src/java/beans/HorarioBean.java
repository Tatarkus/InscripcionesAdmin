/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Clase;
import entities.Horario;
import java.io.Serializable;
import java.util.ArrayList;
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
    
    private String[][] clases  = new String[6][17];;
    
    public HorarioBean (){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 16; j++) {
                clases[i][j]="NA";
            }
        }
    }
    public void obtenerHorario(int run) {
        String data="";
        int dia=0, bloque=0;
        
        
        
        List<Horario> horarioUsuario = horario.findAll();
        for (Horario horario1 : horarioUsuario) {
            
            if (horario1.getUsuariorun().getRun()==run) {
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
                bloque=horario1.getClasecodclase().getBloquecodbloque().getCodBloque()-1;
                clases[dia][bloque]=data;
                  
                
                
                
            }
            
            
        }
                
       
        
    }

    public String[][] getClases() {
        return clases;
    }

    public void setClases(String[][] clases) {
        this.clases = clases;
    }
    
}

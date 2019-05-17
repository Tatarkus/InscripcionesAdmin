package beans;

import entities.Clase;
import entities.Horario;
import entities.Malla;
import entities.Ramo;
import entities.Seccion;
import entities.Usuario;
import java.io.IOException;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import models.ClaseFacade;
import models.HorarioFacade;
import models.MallaFacade;
import models.RamoFacade;
import models.SeccionFacade;
import models.UsuarioFacade;


@Named(value = "inscribirBean")
@SessionScoped
public class InscribirBean implements Serializable {
    @EJB RamoFacade ramoF;
    @EJB MallaFacade mallaF;  
    @EJB UsuarioFacade usrF; ;
    @EJB ClaseFacade claseF; ;
    @EJB HorarioFacade horarioF; 
    @EJB SeccionFacade seccionF; 

    private Collection <Ramo> oferta = new ArrayList<>();
    private Collection <Seccion> secciones = new ArrayList<>();
    private String cod_ramo;
    private int cod_seccion;
    private Usuario usr = new Usuario();
    private Ramo r = new Ramo();
    
    /**
     * Creates a new instance of LoginBean
     */
    
    public InscribirBean()  {            
    }
    
    public void ObtenerOferta(int run)
    {
        usr = usrF.find(run);
        if(usr != null)
        {
            oferta = usr.getMallacodmalla().getRamoCollection();
            
            for (Ramo ramo1 : oferta) {
                System.out.println(ramo1.getNomRamo());
                secciones = ramo1.getSeccionCollection();
                for (Seccion s : secciones) {
                    System.out.println(s.getCodSeccion());
                }
                
            }
        }
        
    }
    
    public void obtenerSecciones()
    {
        
                System.out.println(cod_ramo);
                System.out.println(cod_ramo);
                System.out.println(cod_ramo);
                System.out.println(cod_ramo);
                System.out.println(cod_ramo);
                r = ramoF.find(cod_ramo);
                if(r != null)
                {
                secciones = r.getSeccionCollection();
                for (Seccion s : secciones) {
                    System.out.println(s.getCodSeccion());
                }
                }

    }
    
    public void inscribir()
    {
                Horario horario = new Horario();

                
                for (Clase c :  seccionF.find(cod_seccion).getClaseCollection() ) {
                    horario.setClasecodclase(c);
                    horario.setUsuariorun(usr);
                    horario.setCodHorario(horarioF.count());
                }
               
                
    }
        
        
    
    
    public Collection<Ramo> getOferta() {
        return oferta;
    }

    public Collection<Seccion> getSecciones() {
        return secciones;
    }

    public String getCod_ramo() {
        return cod_ramo;
    }

    public void setCod_ramo(String cod_ramo) {
        this.cod_ramo = cod_ramo;
    }

    public int getCod_seccion() {
        return cod_seccion;
    }

    public void setCod_seccion(int cod_seccion) {
        this.cod_seccion = cod_seccion;
    }
    
    
    
}

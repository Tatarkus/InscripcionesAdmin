package beans;

import entities.Usuario;
import java.io.IOException;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import models.UsuarioFacade;


@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
    @EJB UsuarioFacade user;
    private String nombre;
    private String correo;
    private String contrasena;
    private boolean logeado = false;
    private String msg;
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean()  {
            
    }

    public String logout(){
        
        logeado = false;
             try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("denegado.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        return "";
        
    }
    
    public String permitido(){
        
        if(logeado != true){
            try {
               
                FacesContext.getCurrentInstance().getExternalContext().redirect("denegado.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        return "";
    }
    
     public String login() {
         
         List<Usuario> lista = user.findAll();
         String password="";
         for (Usuario usuario : lista) {
             String correo2 = usuario.getCorreo();
             if (correo.equals(correo2)){
                 password = usuario.getPassword();
                 nombre = usuario.getNombres();
                 break;
             }
         }
         
          if (correo != null  && contrasena != null  && contrasena.equals(password)) {
            logeado = true;
                msg = "Bienvenid@ " + nombre;
             
                     try {
                //return "denegado.xhtml";
                
                FacesContext.getCurrentInstance().getExternalContext().redirect("faces/index.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
                 return "index.xhtml";
          } else {
            logeado = false;
                 msg = "Login Error: " + "Credenciales no válidas";
                 return "denegado.xhtml";

          }
            
     }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}

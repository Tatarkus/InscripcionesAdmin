package jsf;

import entities.Ramo;
import entities.Seccion;
import jsf.util.JsfUtil;
import jsf.util.JsfUtil.PersistAction;
import models.SeccionFacade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.event.AjaxBehaviorEvent;

@Named("seccionController")
@SessionScoped
public class SeccionController implements Serializable {

    @EJB
    private models.SeccionFacade ejbFacade;
    private List<Seccion> items = null;
    private Seccion selected;

    public SeccionController() {
    }

    public Seccion getSelected() {
        return selected;
    }

    public void setSelected(Seccion selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private SeccionFacade getFacade() {
        return ejbFacade;
    }

    public Seccion prepareCreate() {
        selected = new Seccion();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("SeccionCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("SeccionUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("SeccionDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Seccion> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Seccion getSeccion(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Seccion> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Seccion> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }
    
    private String sigla ="";

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    private List <Seccion> listaSecciones = new ArrayList<>();

    public List<Seccion> getListaSecciones() {
        return listaSecciones;
    }

    
    public void setListaSecciones(List<Seccion> listaSecciones) {
        this.listaSecciones = listaSecciones;
    }
            
    public void getSeccionesRamo(AjaxBehaviorEvent e) {
        String cod_ramo = sigla;
       List<Seccion> todaslasSecciones = getFacade().findAll();
       listaSecciones.clear();
        for (Seccion seccion : todaslasSecciones) {
            if(seccion.getRamosigla().getSigla().equals(cod_ramo))
                listaSecciones.add(seccion);
        }
        System.out.println("Buscando las secciones del ramo: "+cod_ramo);
        for (Seccion listaSeccione : listaSecciones) {
            System.out.println(listaSeccione.getSeccion());
        }
    }
    
     Collection<Seccion> getSeccionesRamo(Ramo ramo)
    {
        
        return ramo.getSeccionCollection();
    }
     
     public Collection<Seccion> getSeccionesConClases(Ramo ramo)
    {
        System.out.println("Buscando secciones con clase para el ramo:");
        System.out.println(ramo.getNomRamo());
        Collection<Seccion> secciones = new ArrayList();
        for (Seccion seccion : getSeccionesRamo(ramo)) {
            if(seccion.getClaseCollection().size()>0)
                secciones.add(seccion);
        }
        return secciones;
    }

    @FacesConverter(forClass = Seccion.class)
    public static class SeccionControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            SeccionController controller = (SeccionController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "seccionController");
            return controller.getSeccion(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Seccion) {
                Seccion o = (Seccion) object;
                return getStringKey(o.getCodSeccion());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Seccion.class.getName()});
                return null;
            }
        }

    }

}

package jsf;

import entities.Malla;
import entities.Ramo;
import jsf.util.JsfUtil;
import jsf.util.JsfUtil.PersistAction;
import models.MallaFacade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
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

@Named("mallaController")
@SessionScoped
public class MallaController implements Serializable {

    @EJB
    private models.MallaFacade ejbFacade;
    private List<Malla> items = null;
    private Malla selected;
    private int semestre;

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    

    public MallaController() {
    }

    public Malla getSelected() {
        return selected;
    }

    public void setSelected(Malla selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private MallaFacade getFacade() {
        return ejbFacade;
    }
    
    public void MallaRamo(Ramo ramo)
    {
        Collection<Ramo> ramos =  selected.getRamoCollection();
        ramos.add(ramo);
       
        selected.setRamoCollection(ramos);
                    System.out.println("Malla: "+selected.getNomMalla());

        for (Ramo ramo1 : ramos) {
            System.out.println("ramo: "+ramo1.getNomRamo());
        }
        this.getFacade().edit(selected);
    }
    public Malla prepareCreate() {
        selected = new Malla();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("MallaCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("MallaUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("MallaDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

   
    
    public List<Malla> getItems() {
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

    public Malla getMalla(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Malla> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Malla> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Malla.class)
    public static class MallaControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            MallaController controller = (MallaController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "mallaController");
            return controller.getMalla(getKey(value));
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
            if (object instanceof Malla) {
                Malla o = (Malla) object;
                return getStringKey(o.getCodMalla());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Malla.class.getName()});
                return null;
            }
        }

    }

}

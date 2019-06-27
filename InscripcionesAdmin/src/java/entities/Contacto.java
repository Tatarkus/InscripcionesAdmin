/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tomas
 */
@Entity
@Table(name = "contacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c"),
    @NamedQuery(name = "Contacto.findByIdContacto", query = "SELECT c FROM Contacto c WHERE c.idContacto = :idContacto"),
    @NamedQuery(name = "Contacto.findByNombreContacto", query = "SELECT c FROM Contacto c WHERE c.nombreContacto = :nombreContacto"),
    @NamedQuery(name = "Contacto.findByCorreo", query = "SELECT c FROM Contacto c WHERE c.correo = :correo"),
    @NamedQuery(name = "Contacto.findByTelefono", query = "SELECT c FROM Contacto c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Contacto.findByMotivo", query = "SELECT c FROM Contacto c WHERE c.motivo = :motivo"),
    @NamedQuery(name = "Contacto.findByRequerimiento", query = "SELECT c FROM Contacto c WHERE c.requerimiento = :requerimiento"),
    @NamedQuery(name = "Contacto.findByFechaEnvio", query = "SELECT c FROM Contacto c WHERE c.fechaEnvio = :fechaEnvio")})
public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CONTACTO")
    private Integer idContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMBRE_CONTACTO")
    private String nombreContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CORREO")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO")
    private int telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MOTIVO")
    private String motivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "REQUERIMIENTO")
    private String requerimiento;
    @Column(name = "FECHA_ENVIO")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvio;

    public Contacto() {
    }

    public Contacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public Contacto(Integer idContacto, String nombreContacto, String correo, int telefono, String motivo, String requerimiento) {
        this.idContacto = idContacto;
        this.nombreContacto = nombreContacto;
        this.correo = correo;
        this.telefono = telefono;
        this.motivo = motivo;
        this.requerimiento = requerimiento;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContacto != null ? idContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.idContacto == null && other.idContacto != null) || (this.idContacto != null && !this.idContacto.equals(other.idContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Contacto[ idContacto=" + idContacto + " ]";
    }
    
}

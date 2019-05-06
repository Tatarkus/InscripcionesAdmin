/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "seccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seccion.findAll", query = "SELECT s FROM Seccion s")
    , @NamedQuery(name = "Seccion.findByCodSeccion", query = "SELECT s FROM Seccion s WHERE s.codSeccion = :codSeccion")
    , @NamedQuery(name = "Seccion.findBySeccion", query = "SELECT s FROM Seccion s WHERE s.seccion = :seccion")})
public class Seccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_seccion")
    private Integer codSeccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "seccion")
    private String seccion;
    @JoinColumn(name = "Ramo_sigla", referencedColumnName = "sigla")
    @ManyToOne(optional = false)
    private Ramo ramosigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seccioncodseccion")
    private Collection<Clase> claseCollection;

    public Seccion() {
    }

    public Seccion(Integer codSeccion) {
        this.codSeccion = codSeccion;
    }

    public Seccion(Integer codSeccion, String seccion) {
        this.codSeccion = codSeccion;
        this.seccion = seccion;
    }

    public Integer getCodSeccion() {
        return codSeccion;
    }

    public void setCodSeccion(Integer codSeccion) {
        this.codSeccion = codSeccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Ramo getRamosigla() {
        return ramosigla;
    }

    public void setRamosigla(Ramo ramosigla) {
        this.ramosigla = ramosigla;
    }

    @XmlTransient
    public Collection<Clase> getClaseCollection() {
        return claseCollection;
    }

    public void setClaseCollection(Collection<Clase> claseCollection) {
        this.claseCollection = claseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSeccion != null ? codSeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seccion)) {
            return false;
        }
        Seccion other = (Seccion) object;
        if ((this.codSeccion == null && other.codSeccion != null) || (this.codSeccion != null && !this.codSeccion.equals(other.codSeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Seccion[ codSeccion=" + codSeccion + " ]";
    }
    
}

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
import javax.persistence.ManyToMany;
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
@Table(name = "Ramo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ramo.findAll", query = "SELECT r FROM Ramo r")
    , @NamedQuery(name = "Ramo.findBySigla", query = "SELECT r FROM Ramo r WHERE r.sigla = :sigla")
    , @NamedQuery(name = "Ramo.findByNomRamo", query = "SELECT r FROM Ramo r WHERE r.nomRamo = :nomRamo")})
public class Ramo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_ramo")
    private String nomRamo;
    @ManyToMany(mappedBy = "ramoCollection")
    private Collection<Malla> mallaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ramosigla")
    private Collection<Seccion> seccionCollection;

    public Ramo() {
    }

    public Ramo(String sigla) {
        this.sigla = sigla;
    }

    public Ramo(String sigla, String nomRamo) {
        this.sigla = sigla;
        this.nomRamo = nomRamo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomRamo() {
        return nomRamo;
    }

    public void setNomRamo(String nomRamo) {
        this.nomRamo = nomRamo;
    }

    @XmlTransient
    public Collection<Malla> getMallaCollection() {
        return mallaCollection;
    }

    public void setMallaCollection(Collection<Malla> mallaCollection) {
        this.mallaCollection = mallaCollection;
    }

    @XmlTransient
    public Collection<Seccion> getSeccionCollection() {
        return seccionCollection;
    }

    public void setSeccionCollection(Collection<Seccion> seccionCollection) {
        this.seccionCollection = seccionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sigla != null ? sigla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ramo)) {
            return false;
        }
        Ramo other = (Ramo) object;
        if ((this.sigla == null && other.sigla != null) || (this.sigla != null && !this.sigla.equals(other.sigla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomRamo;
    }
    
}

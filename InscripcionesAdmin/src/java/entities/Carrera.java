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
@Table(name = "Carrera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", query = "SELECT c FROM Carrera c")
    , @NamedQuery(name = "Carrera.findByCodCarrera", query = "SELECT c FROM Carrera c WHERE c.codCarrera = :codCarrera")
    , @NamedQuery(name = "Carrera.findByNomCarrera", query = "SELECT c FROM Carrera c WHERE c.nomCarrera = :nomCarrera")})
public class Carrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_carrera")
    private Integer codCarrera;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_carrera")
    private String nomCarrera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carreracodcarrera")
    private Collection<Malla> mallaCollection;

    public Carrera() {
    }

    public Carrera(Integer codCarrera) {
        this.codCarrera = codCarrera;
    }

    public Carrera(Integer codCarrera, String nomCarrera) {
        this.codCarrera = codCarrera;
        this.nomCarrera = nomCarrera;
    }

    public Integer getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(Integer codCarrera) {
        this.codCarrera = codCarrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    @XmlTransient
    public Collection<Malla> getMallaCollection() {
        return mallaCollection;
    }

    public void setMallaCollection(Collection<Malla> mallaCollection) {
        this.mallaCollection = mallaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCarrera != null ? codCarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        if ((this.codCarrera == null && other.codCarrera != null) || (this.codCarrera != null && !this.codCarrera.equals(other.codCarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Carrera[ codCarrera=" + codCarrera + " ]";
    }
    
}

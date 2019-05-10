/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "Malla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malla.findAll", query = "SELECT m FROM Malla m")
    , @NamedQuery(name = "Malla.findByCodMalla", query = "SELECT m FROM Malla m WHERE m.codMalla = :codMalla")
    , @NamedQuery(name = "Malla.findByNomMalla", query = "SELECT m FROM Malla m WHERE m.nomMalla = :nomMalla")})
public class Malla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_malla")
    private Integer codMalla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_malla")
    private String nomMalla;
    @JoinTable(name = "mallaramo", joinColumns = {
        @JoinColumn(name = "Malla_cod_malla", referencedColumnName = "cod_malla")}, inverseJoinColumns = {
        @JoinColumn(name = "Ramo_sigla", referencedColumnName = "sigla")})
    @ManyToMany
    private Collection<Ramo> ramoCollection;
    @JoinColumn(name = "Carrera_cod_carrera", referencedColumnName = "cod_carrera")
    @ManyToOne(optional = false)
    private Carrera carreracodcarrera;
    @OneToMany(mappedBy = "mallacodmalla")
    private Collection<Usuario> usuarioCollection;

    public Malla() {
    }

    public Malla(Integer codMalla) {
        this.codMalla = codMalla;
    }

    public Malla(Integer codMalla, String nomMalla) {
        this.codMalla = codMalla;
        this.nomMalla = nomMalla;
    }

    public Integer getCodMalla() {
        return codMalla;
    }

    public void setCodMalla(Integer codMalla) {
        this.codMalla = codMalla;
    }

    public String getNomMalla() {
        return nomMalla;
    }

    public void setNomMalla(String nomMalla) {
        this.nomMalla = nomMalla;
    }

    @XmlTransient
    public Collection<Ramo> getRamoCollection() {
        return ramoCollection;
    }

    public void setRamoCollection(Collection<Ramo> ramoCollection) {
        this.ramoCollection = ramoCollection;
    }

    public Carrera getCarreracodcarrera() {
        return carreracodcarrera;
    }

    public void setCarreracodcarrera(Carrera carreracodcarrera) {
        this.carreracodcarrera = carreracodcarrera;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMalla != null ? codMalla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malla)) {
            return false;
        }
        Malla other = (Malla) object;
        if ((this.codMalla == null && other.codMalla != null) || (this.codMalla != null && !this.codMalla.equals(other.codMalla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Malla[ codMalla=" + codMalla + " ]";
    }
    
}

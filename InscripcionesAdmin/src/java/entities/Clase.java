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
@Table(name = "Clase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clase.findAll", query = "SELECT c FROM Clase c")
    , @NamedQuery(name = "Clase.findByCodClase", query = "SELECT c FROM Clase c WHERE c.codClase = :codClase")})
public class Clase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Dia")
    private String dia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Sala")
    private String sala;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clasecodclase")
    private Collection<Horario> horarioCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_clase")
    private Integer codClase;
    @JoinColumn(name = "Bloque_cod_bloque", referencedColumnName = "cod_bloque")
    @ManyToOne(optional = false)
    private Bloque bloquecodbloque;
    @JoinColumn(name = "Seccion_cod_seccion", referencedColumnName = "cod_seccion")
    @ManyToOne(optional = false)
    private Seccion seccioncodseccion;

    public Clase() {
    }

    public Clase(Integer codClase) {
        this.codClase = codClase;
    }

    public Integer getCodClase() {
        return codClase;
    }

    public void setCodClase(Integer codClase) {
        this.codClase = codClase;
    }

    public Bloque getBloquecodbloque() {
        return bloquecodbloque;
    }

    public void setBloquecodbloque(Bloque bloquecodbloque) {
        this.bloquecodbloque = bloquecodbloque;
    }

    public Seccion getSeccioncodseccion() {
        return seccioncodseccion;
    }

    public void setSeccioncodseccion(Seccion seccioncodseccion) {
        this.seccioncodseccion = seccioncodseccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codClase != null ? codClase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clase)) {
            return false;
        }
        Clase other = (Clase) object;
        if ((this.codClase == null && other.codClase != null) || (this.codClase != null && !this.codClase.equals(other.codClase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Clase[ codClase=" + codClase + " ]";
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @XmlTransient
    public Collection<Horario> getHorarioCollection() {
        return horarioCollection;
    }

    public void setHorarioCollection(Collection<Horario> horarioCollection) {
        this.horarioCollection = horarioCollection;
    }
    
}

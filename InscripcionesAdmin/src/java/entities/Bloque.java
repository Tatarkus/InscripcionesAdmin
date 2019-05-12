/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "Bloque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bloque.findAll", query = "SELECT b FROM Bloque b")
    , @NamedQuery(name = "Bloque.findByCodBloque", query = "SELECT b FROM Bloque b WHERE b.codBloque = :codBloque")
    , @NamedQuery(name = "Bloque.findByHoraInicio", query = "SELECT b FROM Bloque b WHERE b.horaInicio = :horaInicio")
    , @NamedQuery(name = "Bloque.findByHoraTermino", query = "SELECT b FROM Bloque b WHERE b.horaTermino = :horaTermino")})
public class Bloque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_bloque")
    private Integer codBloque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_termino")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaTermino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloquecodbloque")
    private Collection<Clase> claseCollection;

    public Bloque() {
    }

    public Bloque(Integer codBloque) {
        this.codBloque = codBloque;
    }

    public Bloque(Integer codBloque, Date horaInicio, Date horaTermino) {
        this.codBloque = codBloque;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public Integer getCodBloque() {
        return codBloque;
    }

    public void setCodBloque(Integer codBloque) {
        this.codBloque = codBloque;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(Date horaTermino) {
        this.horaTermino = horaTermino;
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
        hash += (codBloque != null ? codBloque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bloque)) {
            return false;
        }
        Bloque other = (Bloque) object;
        if ((this.codBloque == null && other.codBloque != null) || (this.codBloque != null && !this.codBloque.equals(other.codBloque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return horaInicio+" - "+horaTermino;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "clase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clase.findAll", query = "SELECT c FROM Clase c")
    , @NamedQuery(name = "Clase.findByCodClase", query = "SELECT c FROM Clase c WHERE c.codClase = :codClase")})
public class Clase implements Serializable {

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
    
}

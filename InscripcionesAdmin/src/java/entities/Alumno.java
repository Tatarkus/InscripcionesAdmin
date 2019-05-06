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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")
    , @NamedQuery(name = "Alumno.findByRun", query = "SELECT a FROM Alumno a WHERE a.run = :run")
    , @NamedQuery(name = "Alumno.findByDv", query = "SELECT a FROM Alumno a WHERE a.dv = :dv")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "run")
    private Integer run;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dv")
    private String dv;
    @JoinColumn(name = "USUARIO_cod_us", referencedColumnName = "cod_us")
    @ManyToOne(optional = false)
    private Usuario uSUARIOcodus;
    @JoinColumn(name = "table1_idtable1", referencedColumnName = "cod_malla")
    @ManyToOne(optional = false)
    private Malla table1Idtable1;

    public Alumno() {
    }

    public Alumno(Integer run) {
        this.run = run;
    }

    public Alumno(Integer run, String dv) {
        this.run = run;
        this.dv = dv;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public Usuario getUSUARIOcodus() {
        return uSUARIOcodus;
    }

    public void setUSUARIOcodus(Usuario uSUARIOcodus) {
        this.uSUARIOcodus = uSUARIOcodus;
    }

    public Malla getTable1Idtable1() {
        return table1Idtable1;
    }

    public void setTable1Idtable1(Malla table1Idtable1) {
        this.table1Idtable1 = table1Idtable1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (run != null ? run.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.run == null && other.run != null) || (this.run != null && !this.run.equals(other.run))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Alumno[ run=" + run + " ]";
    }
    
}

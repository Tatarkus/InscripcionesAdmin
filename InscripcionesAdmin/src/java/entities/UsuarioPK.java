/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Thomas
 */
@Embeddable
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_us")
    private int codUs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPO_USUARIO_cod_tipo")
    private int tIPOUSUARIOcodtipo;

    public UsuarioPK() {
    }

    public UsuarioPK(int codUs, int tIPOUSUARIOcodtipo) {
        this.codUs = codUs;
        this.tIPOUSUARIOcodtipo = tIPOUSUARIOcodtipo;
    }

    public int getCodUs() {
        return codUs;
    }

    public void setCodUs(int codUs) {
        this.codUs = codUs;
    }

    public int getTIPOUSUARIOcodtipo() {
        return tIPOUSUARIOcodtipo;
    }

    public void setTIPOUSUARIOcodtipo(int tIPOUSUARIOcodtipo) {
        this.tIPOUSUARIOcodtipo = tIPOUSUARIOcodtipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codUs;
        hash += (int) tIPOUSUARIOcodtipo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.codUs != other.codUs) {
            return false;
        }
        if (this.tIPOUSUARIOcodtipo != other.tIPOUSUARIOcodtipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsuarioPK[ codUs=" + codUs + ", tIPOUSUARIOcodtipo=" + tIPOUSUARIOcodtipo + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Contacto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tomas
 */
@Stateless
public class ContactoFacade extends AbstractFacade<Contacto> {
    @PersistenceContext(unitName = "InscripcionesAdminPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactoFacade() {
        super(Contacto.class);
    }
    
}

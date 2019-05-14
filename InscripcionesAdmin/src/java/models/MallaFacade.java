/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Malla;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tarkus
 */
@Stateless
public class MallaFacade extends AbstractFacade<Malla> {

    @PersistenceContext(unitName = "InscripcionesAdminPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MallaFacade() {
        super(Malla.class);
    }
    
}

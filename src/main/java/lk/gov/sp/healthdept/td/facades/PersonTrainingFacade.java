/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.td.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lk.gov.sp.healthdept.td.entity.PersonTraining;

/**
 *
 * @author pdhs-sp
 */
@Stateless
public class PersonTrainingFacade extends AbstractFacade<PersonTraining> {
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonTrainingFacade() {
        super(PersonTraining.class);
    }
    
}

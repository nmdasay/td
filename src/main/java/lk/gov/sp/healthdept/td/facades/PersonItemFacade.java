/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.td.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lk.gov.sp.healthdept.td.entity.PersonItem;

/**
 *
 * @author pdhs-sp
 */
@Stateless
public class PersonItemFacade extends AbstractFacade<PersonItem> {
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonItemFacade() {
        super(PersonItem.class);
    }
    
}

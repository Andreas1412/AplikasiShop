/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.dao;

import com.shop.model.User;
import com.shop.model.Users;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 200NS
 */
@Repository
public class UserService {
   
    private EntityManagerFactory emf;
    private EntityManager em;

    public UserService() {
    emf = Persistence.createEntityManagerFactory("AplikasiShopPU");
       em = emf.createEntityManager();   
    }
    
    public void saveUser (User user){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
}

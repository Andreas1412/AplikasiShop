/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AplikasiShopPU");// only conection to db
        EntityManager em = emf.createEntityManager(); // only conection to db
        em.getTransaction().begin();
        
        Product emp = new Product();
        emp.setNamaproduk("Asus");
        emp.setHarga(1000.0);
        
        Product emp1 = new Product();
        emp1.setNamaproduk("LG");
        emp1.setHarga(2000.0);
        
        em.persist(emp);
        em.persist(emp1);
        
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    }
    
    


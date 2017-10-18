/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.dao;


import com.shop.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
//@Transactional
public class ProductService {
   
   EntityManagerFactory emf;
    EntityManager em;
    
    public ProductService() {
       emf = Persistence.createEntityManagerFactory("AplikasiShopPU");
       em = emf.createEntityManager();   
    }
  
    public List<Product> findAllProduct (){
        List<Product> produk ;
         produk= this.em.createNamedQuery("Product.findAll").getResultList();
        return produk;
    }
    
    public Product findById(Integer id){
       Query query = em.createNamedQuery("Product.findById");
       query.setParameter("id", id);
       List<Product> lp = query.getResultList();
       Product p = null;
       if(!lp.isEmpty()){
           p = lp.get(0);
       }
        return p;
    }

    
   

  
    
   
}

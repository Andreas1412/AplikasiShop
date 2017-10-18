/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop;


import com.shop.dao.ProductService;
import com.shop.model.Carts;
import com.shop.model.Product;
import com.shop.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.derby.iapi.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/product")
public class ProductController {
    int Id;
    @Autowired
    ProductService ps;
    List<String> nama = new ArrayList<>();
    List<Double> harga = new ArrayList<>();
  
    @RequestMapping(value = "/all")
    public String showAllProduct(Model model) {
        List<Product> products = ps.findAllProduct();

        model.addAttribute("product", products);
        return "product";

    }

    @RequestMapping(value = "/{id}")
    public String showProduct(@PathVariable Integer id, Model model) {
       Product product = ps.findById(id);
        model.addAttribute("product", product);
        Id = id;
        return "productdetail";
    
    }
    
    @RequestMapping(value ="/beli")
    public String beli(HttpSession session){
       
        Product p = ps.findById(Id);
        String harga = (String.valueOf(p.getHarga()));
        
        //p.getNamaproduk()
        nama.add(p.getNamaproduk());
        //nama.add(0, harga);
        
        session.setAttribute("kart", nama);
        
        
        return"cart";
    }
    
    
}
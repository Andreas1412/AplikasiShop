/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.model;

import java.util.List;

/**
 *
 * @author 200NS
 */
public class Carts {
    
    private String namaCart;
    private Double hargaCart;
    
    private List<String> carts;

    public List<String> getCarts() {
        return carts;
    }

    public void setCarts(List<String> carts) {
        this.carts = carts;
    }

    public String getNamaCart() {
        return namaCart;
    }

    public void setNamaCart(String namaCart) {
        this.namaCart = namaCart;
    }

    public Double getHargaCart() {
        return hargaCart;
    }

    public void setHargaCart(Double hargaCart) {
        this.hargaCart = hargaCart;
    }
    
}

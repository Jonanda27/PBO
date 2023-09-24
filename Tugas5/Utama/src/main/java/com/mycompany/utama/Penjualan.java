/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utama;

/**
 *
 * @author LENOVO
 */
public class Penjualan {
    private Produk produk;
    private int quantity;

    public Penjualan(Produk produk, int quantity) {
        this.produk = produk;
        this.quantity = quantity;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalHarga() {
        return produk.getHarga() * quantity;
    }
    
    
   
}


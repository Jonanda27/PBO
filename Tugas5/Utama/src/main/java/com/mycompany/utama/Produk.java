/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utama;

/**
 *
 * @author LENOVO
 */
public class Produk {
    private String namaProduk;
    private int harga;
    private int qty;

    public Produk(String namaProduk, int harga, int qty) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = qty;
    }
    

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }
}


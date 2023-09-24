/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantmain;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuItem> menuMakanan;

    public Restaurant() {
        menuMakanan = new ArrayList<>();
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        MenuItem item = new MenuItem(nama, harga, stok);
        menuMakanan.add(item);
    }

    public void tampilMenuMakanan() {
        for (MenuItem item : menuMakanan) {
            if (item.getStok() > 0) {
                System.out.println(item.getNama() + "[" + item.getStok() + "]" + "\tRP." + item.getHarga());
            }
        }
    }

    public void pesanMenu(String namaMenu, int jumlah) {
        for (MenuItem item : menuMakanan) {
            if (namaMenu.equalsIgnoreCase(item.getNama())) {
                item.kurangStok(jumlah);
                System.out.println("Pesanan Anda: " + item.getNama() + " x" + jumlah);
                return;
            }
        }
        System.out.println("Menu " + namaMenu + " tidak ditemukan.");
    }
}



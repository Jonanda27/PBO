/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gajiagent;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class GajiAgent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = input.nextInt();
      
        int gajiPokok = 500000;

        int hargaItem = 50000;

        double bonusPenjualan = 0;

        if (jumlahPenjualan >= 80) {
            bonusPenjualan = 0.35 * jumlahPenjualan * hargaItem;
        } else if (jumlahPenjualan >= 40) {
            bonusPenjualan = 0.25 * jumlahPenjualan * hargaItem;
        } else if (jumlahPenjualan >= 15) {
            bonusPenjualan = 0.1 * jumlahPenjualan * hargaItem;
        }

        double denda = 0;
        if (jumlahPenjualan < 15) {
            denda = 0.15 * (15 - jumlahPenjualan) * hargaItem;
        }

        int totalGaji = (int) (gajiPokok + bonusPenjualan - denda);


        System.out.println("Total gaji yang diterima: " + totalGaji);

        input.close();
    }
}

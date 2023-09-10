/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bukatutup;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BukaTutup {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Memecah input menjadi plat number mobil
        String[] platNumbers = input.split(" ");

        // Menggabungkan angka plat number ke dalam satu string
        String combinedNumbers = "";
        for (String platNumber : platNumbers) {
            combinedNumbers += platNumber;
        }

        // Mengkonversi string gabungan menjadi angka
        long combinedValue = Long.parseLong(combinedNumbers);

        // Menghitung sisa bagi setelah mengurangi 999999
        long remainder = (combinedValue - 999999) % 5;

        // Menentukan apakah harus berhenti atau jalan
        String result = (remainder != 0) ? "berhenti" : "jalan";

        // Menampilkan hasil
        System.out.println(result);

        scanner.close();
    }
}

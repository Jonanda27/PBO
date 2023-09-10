/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BigNumber {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dua angka dalam bentuk string
        System.out.println("Masukkan angka pertama:");
        String aStr = scanner.nextLine();
        System.out.println("Masukkan angka kedua:");
        String bStr = scanner.nextLine();

        // Membuat objek BigInteger dari string input
        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);

        // Melakukan operasi penjumlahan dan perkalian
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        // Mencetak hasil tanpa leading zeros
        System.out.println(sum.toString());
        System.out.println(product.toString());

        scanner.close();
    }
}

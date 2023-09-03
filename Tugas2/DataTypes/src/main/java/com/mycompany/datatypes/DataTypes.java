/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatypes;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jumlah yang ingin dites :");
        int x = scanner.nextInt(); 
        
        
        for (int i = 0; i < x; i++) {
            try {
                System.out.println("masukkan value:");
                int n = scanner.nextInt(); 
                
                System.out.println(n + " can be fitted in:");
                
              
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
                    System.out.println("* long");
                }                           
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}

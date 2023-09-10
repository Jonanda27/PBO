/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputoutput2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class InputOutput2 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Format: (String Integer)");

        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d%n", str, num);
        }

        scanner.close();
    }
}

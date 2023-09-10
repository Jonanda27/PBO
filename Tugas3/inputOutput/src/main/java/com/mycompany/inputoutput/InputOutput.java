/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputoutput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
public class InputOutput {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        // Gunakan ekspresi regular untuk menemukan semua karakter alfabetik berurutan
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);
        
        int count = 0;
        
        // Hitung jumlah token dan cetak setiap token
        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }
        
        // Cetak jumlah total token
        System.out.println(count);
    }
}

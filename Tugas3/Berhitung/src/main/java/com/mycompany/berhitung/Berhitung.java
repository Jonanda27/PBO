/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.berhitung;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Berhitung {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int operatorIndex = -1;
        char[] operators = {'+', '-', '*', '/', '%'};

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (char operator : operators) {
                if (c == operator) {
                    operatorIndex = i;
                    break;
                }
            }
            if (operatorIndex != -1) {
                break;
            }
        }

        if (operatorIndex != -1) {
            String strA = input.substring(0, operatorIndex).trim();
            char operator = input.charAt(operatorIndex);
            String strB = input.substring(operatorIndex + 1).trim();

            int A = Integer.parseInt(strA);
            int B = Integer.parseInt(strB);

            int hasil = 0;

            switch (operator) {
                case '+':
                    hasil = A + B;
                    break;
                case '-':
                    hasil = A - B;
                    break;
                case '*':
                    hasil = A * B;
                    break;
                case '/':
                    hasil = A / B;
                    break;
                case '%':
                    hasil = A % B;
                    break;
                default:
                    System.out.println("Operator tidak valid.");
                    return;
            }

            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Operasi tidak valid.");
        }

        scanner.close();
    }
}


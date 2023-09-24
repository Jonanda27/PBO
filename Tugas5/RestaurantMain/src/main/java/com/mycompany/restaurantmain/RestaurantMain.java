/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantmain;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();

        Scanner sc = new Scanner(System.in);
        System.out.print("Pesan makanan: ");
        String makan = sc.nextLine();
        System.out.print("Jumlah: ");
        int banyak = sc.nextInt();

        menu.pesanMenu(makan, banyak);
        menu.tampilMenuMakanan();
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal3;
import java.util.Scanner;

/**
 *
 * @author hamasawojajar
 */
public class Soal3 {


    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan positif: ");
            int n = input.nextInt();
            
            long hasil = 1;
            
            // Perulangan dari 1 sampai n
            for (int i = 1; i <= n; i++) {
                hasil *= i; // hasil = hasil * i
                System.out.println("Langkah ke-" + i + ": " + hasil);
            }
            
            System.out.println(n + "! = " + hasil);
        }
        }
    }




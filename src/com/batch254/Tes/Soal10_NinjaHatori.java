package com.batch254.Tes;

import java.util.Arrays;
import java.util.Scanner;

public class Soal10_NinjaHatori {
    public static void Resolve() {

            Scanner input = new Scanner(System.in);
            System.out.println("N=Naik || T: Turun");
            System.out.println("Masukkan Gerakan: ");
            String langkah = input.nextLine();


            int mdpl = 0;
            int lembah = 0;
            int gunung = 0;

            //kondisi dimana untuk menghitung banyak lembah dan banyak gunung
            for (int i = 0; i < langkah.length(); i++) { // perulangan untuk menghitung langkah untuk mendeskripsikan banyak lembah dan banyak turun
                if (langkah.charAt(i) == 'T') {
                    mdpl--;
                    if (mdpl == 0) {
                        gunung = gunung + 1;
                    }
                } else if (langkah.charAt(i) == 'N') {
                    mdpl++;

                    if (mdpl == 0) {
                        lembah = lembah + 1;
                    }
                }
            }
            System.out.println("Lembah :" + lembah);
            System.out.println("Gunung :" + gunung);
        }
    }

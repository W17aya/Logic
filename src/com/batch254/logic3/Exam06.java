package com.batch254.logic3;

import java.util.Scanner;

public class Exam06 {

    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        int i, j, k, pagar;
        boolean ulang = true;


        Scanner baca = new Scanner(System.in);

        while (ulang) {
            System.out.print("Sample Input? ");
            pagar = baca.nextInt();

            i = 1;
            while (i <= pagar) {
                k = pagar;

                while (k > i) {
                    System.out.print("  ");
                    k--;
                }

                j = 1;
                while (j <= i) {
                    System.out.print("#");
                    j++;
                }

                i++;
                System.out.println("");
            }
        }
    }
}
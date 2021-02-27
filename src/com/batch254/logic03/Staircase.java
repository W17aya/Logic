package com.batch254.logic03;

import java.util.Scanner;

public class Staircase {

    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan angka yang akan dirubah menjadi piramida pagar: ");
        int length = input.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i + j >= length - 1)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package com.batch254.logic03;

import java.util.Scanner;

public class Exam06 {

    public static void Resolve() {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number");
        int n = input.nextInt();
        int i, j;


        for (i = 0; i < n; i++) //looping jumlah baris
        {
            for (j = 2 * (n - i); j >= 0; j--) // inner loop for spaces
            {
                System.out.print(" "); // print spasi
            }
            for (j = 0; j <= i; j++) //  loop dalam kolom
            {
                System.out.print("#"); // print pagar
            }
            System.out.println(); // ending line
        }

    }
}

package com.batch254.logic01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // untuk input
        Scanner input = new Scanner(System.in);
        System.out.println("Input length:");
        int length = input.nextInt();
        int[] arrayNumber = new int[length];
        System.out.println("============");


//         Nomor 01 --> 1 3 5 7 9 11 13 (n = 7)
        System.out.println(" Soal nomor 1 Input length: ");

        int Number1 = 1;
        for (int i = 0; i < length; i++) {
            System.out.print((Number1) + " ");
            Number1 += 2;
        }

        System.out.println(" ");

//        Nomor 02 --> 2 4 6 8 10 12 14

        System.out.println("Nomor 2");

        int[] arrayNumber2 = new int[length];
        int Number2 = 2;

        for (int i = 0; i < length; i++) {
            arrayNumber2[i] = Number2;
            Number2 += 2;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arrayNumber2[i] + " ");
        }
        System.out.println(" ");

//        Nomor 03 --> 1 4 7 10 13 16 19

        System.out.println("Nomor 3");


        int number3 = 1;

        for (int i = 0; i < length; i++) {
            System.out.print(number3 + " ");
            number3 += 3;
        }

        System.out.println(" ");

        //Nomor 04 --> 1 4 7 10 13 16 1

        System.out.println("Nomor 4");
        int Number4 = 1;

        for (int j = 0; j < length; j++) {
            System.out.print(Number4 + " ");
            Number4 += 4;
        }
        System.out.print(" ");

        //nomor 5 -> 1	5	*	9	13	*	17
        System.out.println();
        System.out.println("Nomor 5");
        int Number5 = 1;

        for (int i = 0; i < length; i++) {
            if ((i + 1) % 3 == 0) {
                System.out.print(" * ");
            } else {
                System.out.print(Number5 + " ");
                Number5 = Number5 + 4;
            }
            System.out.print(" ");
        }
        //nomor 6 -> 1	5	*	13	17	*	25

        System.out.println(" ");
        System.out.println("Nomor 6");
        int Number6 = 1;

        for (int j = 0; j < length; j++) {
            if ((j + 1) % 3 == 0) {
                System.out.print(" * ");
            } else {
                System.out.print(Number6 + " ");
            }
            Number6 = Number6 + 4;
        }

        System.out.print(" ");

        // nomor 7 -> 2	4	8	16	32	64	128
        System.out.println(" ");
        System.out.println("Nomor 7");
        int Number7 = 2;

        for (int i = 0; i < length; i++) {
            System.out.print(Number7 + " ");
            Number7 *= 2;

            System.out.print(" ");
        }
        // nomor 8 -> 3	9	27	81	243	729	2187
        System.out.println(" ");
        System.out.println("Nomor 8");
        int Number8 = 3;

        for (int n = 0; n < length; n++) {
            System.out.print(Number8 + " ");
            Number8 *= 3;

            System.out.print(" ");
        }
        // nomor 9 ->  4	16	*	64	256	*	1024

        System.out.println(" ");
        System.out.println("Nomor 9");
        int Number9 = 4;

        for (int j = 0; j < length; j++) {
            if ((j + 1) % 3 == 0) {
                System.out.print(" * ");
            } else {
                System.out.print(Number9 + " ");
                Number9 = Number9 * 4;
            }
        }
        // nomor 10 ->  3	9	27	XXX	243	729	2187

        System.out.println(" ");
        System.out.println("Nomor 10");
        int Number10 = 3;

        for (int i = 0; i < length; i++) {
            if ((i + 1) % 4 == 0) {
                System.out.print(" XXXX ");
            } else {
                System.out.print(Number10 + " ");

            }
            Number10 = Number10 * 3;
        }

        // nomer 11 ->  1 1 2 3 5 8 13

        System.out.println(" ");
        System.out.println("Nomor 11");

        int Number11 = 1;
        int arrayKe1;

        for (int i = 0; i < length; i++) {
            arrayNumber[i] = Number11;

            if (i == 0) {
                System.out.print(arrayNumber[i] + " ");
            } else {
                System.out.print(arrayNumber[i] + " ");
                arrayKe1 = i - 1;
                Number11 = Number11 + arrayNumber[arrayKe1];
            }
        }

        //nomer 12 -> 1 1 1 3 5 9 17


        System.out.println(" ");
        System.out.println("Nomor 12");

        int Number12 = 1;
        int arrayKe01;
        int arrayKe02;

        for (int i = 0; i < length; i++) {
            arrayNumber[i] = Number12;

            if (i < 2) {
                System.out.print(arrayNumber[i] + " ");
            } else {
                System.out.print(arrayNumber[i] + " ");
                arrayKe01 = i - 1;
                arrayKe02 = i - 2;
                Number12 = Number12 + arrayNumber[arrayKe01] + arrayNumber[arrayKe02];
            }
        }
//
//        // nomer 13 ->  2, 3, 5, 7, 11, 13, 17
//
//        System.out.println(" ");
//        System.out.println("Nomor 13");
//
//        int Number13 = 0, n = 0, i = 1, j = 1;
//        while (n < 7) {
//            j = 1;
//            Number13 = 0;
//            while (j <= i) {
//                if (i % j == 0)
//                    Number13++;
//                j++;
//            }
//            if (Number13 == 2) {
//                System.out.printf("%d ", i);
//                n++;
//            }
//            i++;
    }
}



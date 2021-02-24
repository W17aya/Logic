package com.batch254.logic3;

import java.util.Scanner;

public class Exam01 {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);

        int a, b, tambah, kurang, kali, bagi;

        System.out.println("Input Bilangan Pertama: ");
        a = input.nextInt();


        System.out.println("Input bilangan kedua: ");
        b = input.nextInt();
        tambah = a + b;
        kurang = a - b;
        kali = a * b;
        bagi = a / b;

        System.out.println("SOLVE ME FIRST");

        System.out.println("Penambahan :" + tambah);
        System.out.println("Pengurangan :" + kurang);
        System.out.println("Perkalian :" + kali);
        System.out.println("Pembagian :" + bagi);

    }
}

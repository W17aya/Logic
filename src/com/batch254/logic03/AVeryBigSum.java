package com.batch254.logic03;

import java.util.Scanner;

public class AVeryBigSum {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);

        System.out.println("Input length : ");
//        String text = input.nextLine();
        int length = input.nextInt();

        int[] arrayNilai = new int[length];
        long tambah = 0;

        System.out.print("Masukkan " + length + " deret angka: ");
        for (int i = 0; i < arrayNilai.length; i++) {
            arrayNilai[i] = input.nextInt();
        }

        for (int i = 0; i < arrayNilai.length; i++) {
            tambah = tambah + arrayNilai[i];
        }

        System.out.println("Hasil sum = " + tambah);
    }

    public static void main(String[] args) {
        Resolve();
    }
}

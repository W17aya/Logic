package com.batch254.logic03;

import java.util.Scanner;

public class Mean {
    public static void Resolve() {

        System.out.println("Masukkan Nilai yang ingin di cari rata-rata nya:");
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();

        double[] nilai = new double[sum];
        double total = 0;
        double Hasil;

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukan nilai" + (i + 1) +": ");
            nilai[i] = input.nextDouble();
        }
        for (int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
        }
         Hasil = total / nilai.length;
        System.out.println("Jadi Nilai Rata-Rata:" + Hasil);
    }
}


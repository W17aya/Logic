package com.batch254.logic03;

import java.util.Scanner;

public class PlusMinus {
    public static void Resolve () {
        Scanner input = new Scanner(System.in);

        //input length
        System.out.println("input panjang angka: ");
        int length = input.nextInt();

        input.nextLine();

        //input angka yang akan diproses
        System.out.println("Masukkan  angka berurutan:");
        String text = input.nextLine();

        int[] numbers = Utility.StringToArrayInt(text);

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        double akhir;
        int negatif = 0;
        int positif = 0;
        int zero = 0;

        for (int j = 0; j < numbers.length; j++ ){
            if ( numbers[j] < 0) {
                negatif = negatif + 1;
            }
            else if (numbers[j] > 0) {
                positif = positif + 1;
            } else {
                zero = zero + 1;
            }
        }

        //output negatif
        System.out.println("Jumlah nilai negatif: " + negatif + " ");
        double negatif2 = Double.valueOf(negatif)/Double.valueOf(numbers.length); //konversi
        System.out.println("Hasil bagi negatif dengan panjang angka: " + negatif2 + " ");

        //output positif
        System.out.println("Jumlah nilai positif: " + positif + " ");
        double positif2 = Double.valueOf(positif)/Double.valueOf(numbers.length); //konversi data string
        System.out.println("Hasil bagi postif dengan panjang angka: " + positif2 + " ");

        //output zero
        System.out.println("Jumlah nilai zero: " + zero + " ");
        double zero2 = Double.valueOf(zero)/Double.valueOf(numbers.length);
        System.out.println("Hasil bagi zero dengan panjang angka: " + zero2 + " ");

    }
}
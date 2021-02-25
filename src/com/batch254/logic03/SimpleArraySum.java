package com.batch254.logic03;

import java.util.Scanner;

public class SimpleArraySum {
    public static void Resolve () {

        Scanner input = new Scanner(System.in);

        //input angka yang akan diproses
        System.out.println("Enter set of number:");
        String text = input.nextLine();

        int[] numbers = Utility.StringToArrayInt(text);

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        int jumlah = 0;

        for (int j = 0; j < numbers.length; j++ ){
            jumlah += numbers[j];
        }
        System.out.println("Hasil dari penjumlahan Simple Array adalah " + jumlah + " ");

    }
}
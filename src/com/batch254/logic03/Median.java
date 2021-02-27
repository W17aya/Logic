package com.batch254.logic03;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter set of number: ");

        int[] numbers = Utility.StringToArrayInt(input.nextLine());


        int tempat = 0; //inisialisasi tempat baru untuk pemindahan
        double median = 0; //inisialisasi median



        //untuk mengurutkan
        for (int i = 0; i < numbers.length; i++) {
            //int j = i + 1 untuk penambahan nilai i yg diawal
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    tempat = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempat;
                }
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //mencari median
        double median1 = numbers[numbers.length / 2];
        double median2 = (numbers[numbers.length / 2] + numbers[(numbers.length/2)-1]) /2.0;
        if (numbers.length % 2 != 0) {
            System.out.println("Nilai Median: " + median1);
        } else {
            System.out.println("Nilai Median: " + median2);
        }
    }
}
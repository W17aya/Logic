package com.batch254.logic03;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTheTriplets {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("input length: ");
        String text = input.nextLine();
        int[] numbers = Utility.StringToArrayInt(text);

        int[] nilai1;
        int[] nilai2;
        int[] nilaiTertinggi = {0,0};

        //input angka yang akan diproses
        System.out.println("Input Nilai1: ");
        nilai1 = Utility.StringToArrayInt(input.nextLine());

        //input angka yang akan diproses
        System.out.println("Input Nilai2: ");
        nilai2 = Utility.StringToArrayInt(input.nextLine());

        for (int i = 0; i < numbers.length; i++){
            //System.out.print(numbers[i] + " ");
            if (nilai1[i] > nilai2[i]){
                nilaiTertinggi[0]++;  //jika nilai1 lebih tinggi maka index 0 bertambah
            }else if (nilai1[i] < nilai2[i]){
                nilaiTertinggi[1]++; //jika nilai2 lebih tinggi maka indek 1 bertambah
            }
        }
        //Arrays.toString untuk mencetak variable array menjadi string
        System.out.println(" Nilai Tertinggi: " + Arrays.toString(nilaiTertinggi));
    }
}
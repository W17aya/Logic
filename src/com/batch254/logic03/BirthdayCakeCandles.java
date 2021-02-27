package com.batch254.logic03;

import java.util.Scanner;
public class BirthdayCakeCandles {
    public static void Resolve () {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Nilai : ");
        String text = input.nextLine();
        int[] number = Utility.StringToArrayInt(text);

        int height = 0;
        int jumlah = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > height) {
                height = number[i];
            }
        }


        for (int i = 0; i < number.length; i++) {
            if (number[i] == height) {
                jumlah++;
            }
        }
        System.out.println("Hasil : " + jumlah);
    }

}
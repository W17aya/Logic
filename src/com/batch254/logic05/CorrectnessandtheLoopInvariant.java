package com.batch254.logic05;

import com.batch254.logic03.Utility;

import java.util.Scanner;

public class CorrectnessandtheLoopInvariant {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Nilai : ");
        String text = input.nextLine();

        int[] number = Utility.StringToArrayInt(text);
        int temporary; // inisiasi variabel sementara

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    temporary = number[i]; //memindahkan nilai i ke variabel sementara
                    number[i] = number[j];
                    number[j] = temporary;
                }
            }
            System.out.print(number[i] + " ");
        }
    }
}
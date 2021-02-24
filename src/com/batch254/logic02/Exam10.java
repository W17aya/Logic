package com.batch254.logic02;

import java.util.Scanner;

public class Exam10 {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);


        System.out.println("Input Column: ");
        int column = input.nextInt();

        System.out.println("Input the number: ");
        int number = input.nextInt();

        System.out.println("SOAL NO 10");

        int[][] array2d = new int[3][column];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (i == 0) {
                    array2d[i][j] = j;
                } else if (i < 2) {
                    if (j == 0) {
                    } else {
                        array2d[i][j] = array2d[i - 1][j] * number;
                    }
                } else {
                    array2d[i][j] = array2d[i - 2][j] * (number + 1);
                }
            }

        }
        Utility.PrintArray2D(array2d);
    }
}
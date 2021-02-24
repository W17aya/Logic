package com.batch254.logic02;

import java.util.Scanner;

public class Exam08 {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);


        System.out.println("Input Column: ");
        int column = input.nextInt();


        System.out.println("SOAL NO 8");

        int helper = 1;
        int[][] array2d = new int[3][column];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (i == 0) {
                    array2d[i][j] = j;
                } else {
                    array2d[i][j] = array2d[0][j] * helper;
                }
            }
            helper++;
        }


        Utility.PrintArray2D(array2d);
    }
}
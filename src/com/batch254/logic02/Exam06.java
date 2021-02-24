package com.batch254.logic02;

import java.util.Scanner;

public class Exam06 {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input column:  ");
        int column = input.nextInt();

        System.out.println("SOAL NO 6");
        int[][] array2d = new int[3][column];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (i == 0) {
                    array2d[i][j] = j;
                } else if (i < 2) {
                    array2d[i][j] = (int) Math.pow(column, j);
                } else {
                    array2d[i][j] = array2d[i - 1][j] + j;
                }
            }
        }
        Utility.PrintArray2D(array2d);
    }
}

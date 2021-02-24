package com.batch254.logic02;

import java.util.Scanner;

public class Exam03 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        //input untuk kolom dan number
        System.out.println("input column: ");
        int column = input.nextInt();

        System.out.println("input the number : ");
        int number = input.nextInt();


        int[][] array2d = new int[2][column];


        int helper = column / 2;


        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (i == 0) {
                    array2d[i][j] = j;
                } else {

                    if (column % 2 == 0) {
                        if (j < helper) {
                            array2d[i][j] = number;
                            number = number * 2;
                        } else {
                            number = number / 2;
                            array2d[i][j] = number;
                        }
                    } else {
                        if (j < helper) {
                            array2d[i][j] = number;
                            number = number * 2;
                        } else {
                            array2d[i][j] = number;
                            number = number / 2;
                        }
                    }

                }

            }

        }
        //cetak output
        Utility.PrintArray2D(array2d);
    }
}
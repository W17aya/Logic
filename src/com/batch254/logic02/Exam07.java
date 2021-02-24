package com.batch254.logic02;

import java.util.Scanner;

public class Exam07 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);


        System.out.println("Input column:  ");
        int column = input.nextInt();


        System.out.println("Input the number: ");
        input.nextInt();


        System.out.println("SOAL NO 7");
        int[][] array2d = new int[3][column];

        int helper = 0;

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = helper;
                helper++;
            }
        }
        Utility.PrintArray2D(array2d);
    }
}
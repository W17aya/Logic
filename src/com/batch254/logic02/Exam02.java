package com.batch254.logic02;

import java.util.Scanner;

public class Exam02 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);


        System.out.println("Input column: ");
        int column = input.nextInt();


        System.out.println("Input the number: ");
        int number = input.nextInt();


        System.out.println("SOAL NO 2");
        int array2d[][] = new int[2][column];
        int bilangan;


        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (i == 0) {
                    array2d[i][j] = j;
                } else if ((j + 1) % 3 == 0) {
                    bilangan = (int) Math.pow(number, j);
                    array2d[i][j] = bilangan * -1;
                } else {
                    array2d[i][j] = (int) Math.pow(number, j);
                }
            }
        }


        Utility.PrintArray2D(array2d);

    }
}

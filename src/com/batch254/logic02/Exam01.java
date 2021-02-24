package com.batch254.logic02;

import java.util.Scanner;

public class Exam01 {

    public static void Resolve()
    {
        Scanner input = new Scanner(System.in);


        // soal 01
        System.out.println("Input column: ");
        int column = input.nextInt();


        System.out.println("Input the number: ");
        int number = input.nextInt();


        System.out.println("SOAL NO 1");
        int array2d[][] = new int[2][column];
        int helper = 0;


        //pengerjaan (memasukan value atau nilai ke variable
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (i == 0) {
                    array2d[i][j] = helper;
                    helper++;
                } else {
                    array2d[i][j] = (int) Math.pow(number, helper);
                    helper++;
                }
            }
            helper = 0;
        }

        //cetak atau print (output)
        Utility.PrintArray2D(array2d);
    }
}

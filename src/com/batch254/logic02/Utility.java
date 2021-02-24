package com.batch254.logic02;

public class Utility {

    public static void PrintArray2D(int[][] array2d) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package com.batch254.logic03;
import java.util.Scanner;
public class DiagonalDifference {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Nilai: ");
        int length = input.nextInt();
        input.nextLine();
        int [][] nilai = new int[length][length];
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("Silahkan input baris " + (i + 1));

            String numbers = input.nextLine();

            int[] arrayNumbers = Utility.StringToArrayInt(numbers);
            for (int j = 0; j < length; j++)
            {
                nilai[i][j] = arrayNumbers[j];
            }
        }

        //Nilai inputan dirubah menjadi matriks diagonal
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" " + nilai[i][j]);
            }
            System.out.println("");
        }
        //diagonal 1
        System.out.print("Diagonal 1 : ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    System.out.print(nilai[i][j] + ", "); // cetak nilai yang masuk ke kondisi
                    diagonal1 = diagonal1 + nilai[i][j]; //sum nilai yang ada di index i dan j jik kondisi true
                }
            }
        }
        System.out.println();

        //diagonal 2
        System.out.print("Diagonal 2 : ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i + j) == (length - 1)) {
                    System.out.print(nilai[i][j] + ", ");
                    diagonal2 = diagonal2 + nilai[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Nilai selisih : " + Math.abs(diagonal1-diagonal2));
    }
}

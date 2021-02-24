package com.batch254.logic02;

import java.util.Scanner;

public class Exam04 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);


        System.out.println("Input column:  ");
        int column = input.nextInt();

        int[][] array2d = new int[2][column];

        System.out.println("Input the number: ");
        int number4 = input.nextInt();

        int helper =1;

        System.out.println("Soal No 4");


        for (int i = 0; i <array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (i==0)
                {
                    array2d[i][j] = j;
            }else {
                    if (( j + 1) % 2 == 0)
                    {
                        if (j < 2)
                        {
                            array2d[i][j] = number4;
                        } else {
                            array2d[i][j] = array2d[i][j - 2] + number4;
                        }
                    }
                        else
                        {
                            array2d[i][j] = helper++;
                        }

                    }
                }

        }
            //cetak atau print (output)
            Utility.PrintArray2D(array2d);
        }
    }

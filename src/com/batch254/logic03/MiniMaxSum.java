package com.batch254.logic03;
import java.util.Scanner;


public class MiniMaxSum {

    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan beberapa angka sekaligus:");
        String text = input.nextLine();

        int[]value = Utility.StringToArrayInt(text);

        int temporary = 0;
        int Max =0;
        int Min = 0;


        for (int i = 0; i <value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] > value[j]) {
                    temporary = value[i];
                    value[i] = value[j];
                    value[j] = temporary;
                }
            }
        }

        for (int i = 0; i <value.length; i++) {
            if ( i != 0){
                Max += value[i];
            }
            if (i !=( value.length -1))
            {
                Min += value[i];
            }
        }

        Utility.PrintInt(Min);
        Utility.PrintInt(Max);
    }
}
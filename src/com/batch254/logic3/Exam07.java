package com.batch254.logic3;


import java.util.Scanner;


public class Exam07 {

    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter set of number:");
        String text = input.nextLine();

        int[]value = Utility.StringToArrayInt(text);
        int Max =0;
        int Min = 0;

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
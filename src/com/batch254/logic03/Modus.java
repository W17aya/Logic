package com.batch254.logic03;

import java.util.Scanner;

public class Modus {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        String text = input.nextLine();

        int[] number = Utility.StringToArrayInt(text);

        int helper=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + i; j < number.length; j++)
                if (number[i] > number[j]) {
                    helper = number[i];
                    number[i] = number[j];
                    number[j] = helper;
                }
        }
        int temporary = 0;
        int maksimum = 0;
        String modus = "";

        for (int i = 0; i < number.length - 1; i++)
        {
            if (number[i] == number[i + 1])
            {
                temporary++;
            }
            else if (temporary > maksimum)
            {
                maksimum = temporary;
                modus = Integer.toString(number[i]);
                temporary = 0;
            } else if (temporary == maksimum)

            {
                modus += "" + (Integer.toString(number[number.length - 1]));
                temporary = 0;
            }
        }
        System.out.println("Nilai Modus : " + modus);
    }
}

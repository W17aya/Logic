package com.batch254.logic03;

import com.batch254.logic03.Utility;

import java.util.Scanner;

public class Modus {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        String text = input.nextLine();

        int[] number = Utility.StringToArrayInt(text);

        int helper = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    helper = number[i];
                    number[i] = number[j];
                    number[j] = helper;
                }
            }
        }

        int temp = 0;
        int maksimum = 0;
        String modus = "";
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == number[i + 1]) {
                temp++;
            }
            else if (temp > maksimum) {
                maksimum = temp;
                modus = Integer.toString(number[i]);
                temp = 0;
            } else if (temp == maksimum) {
                modus += " " + (Integer.toString(number[i]));
                temp = 0;
            }
        }
        if (temp > maksimum) {
            modus = Integer.toString(number[number.length - 1]);
        }
        else if (temp == maksimum) {
            maksimum = temp;
            modus += " " + (Integer.toString(number[number.length - 1]));
        }


        System.out.println("modusnya adalah : ");
        System.out.print(modus);
        System.out.println();
    }
}

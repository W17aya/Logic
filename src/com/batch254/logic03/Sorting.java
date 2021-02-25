package com.batch254.logic03;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Nilai : ");
        String text = input.nextLine();

        int[] number = Utility.StringToArrayInt(text);
        int tempt = 0; // inisiasi variabel sementara

        for (int i = 0; i < number.length; i++)
        {
            for (int j = i + 1; j < number.length; j++)
            {
                if (number[i] > number[j])
                {
                    tempt = number[i]; //memindahkan nilai i ke varaibel sementara
                    number[i] = number[j];
                    number[j] = tempt;
                }
            }
            System.out.print(number[i] + " ");
        }
    }
}


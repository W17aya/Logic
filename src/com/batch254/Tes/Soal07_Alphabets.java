package com.batch254.Tes;


import java.util.Scanner;

public class Soal07_Alphabets {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kalimat: ");
        String words = input.nextLine();


        String[] wordString = words.split(" ");
        String result = " ";
        {

            for (int i = 0; i < wordString.length; i++) {
                char[] wordChar = wordString[i].toCharArray();
                {

                    result = result + wordString[i];
                }
                System.out.println(result);
            }
        }
    }
}
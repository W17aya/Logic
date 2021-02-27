package com.batch254.logic04;

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

public class Exam11 {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String words = input.nextLine();

        String[] wordString = words.split(" ");
        String result = "";

        for (int i = 0; i < wordString.length; i++) {
            char[] wordChar = wordString[i].toCharArray();
            for (int j = 0; j < wordChar.length; j++) {
                if (wordChar.length > 2) {
                    if (j != 0 && j != wordChar.length - 1) {
                        wordChar[j] = '*';
                    }
                }
                result = result + wordChar[j];
            }
            System.out.println(result);

        }
    }
}
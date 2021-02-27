package com.batch254.logic04;

import java.util.Scanner;


public class Exam1 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan String: ");
        String karakter = input.nextLine();
        int count = 0;

        for (int i = 0; i < karakter.length(); i++) {
            if (Character.isUpperCase(karakter.charAt(i))) {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}


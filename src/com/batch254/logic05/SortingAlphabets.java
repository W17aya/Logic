package com.batch254.logic05;

import com.batch254.logic03.Utility;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlphabets {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan String: ");
        String str = input.nextLine();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
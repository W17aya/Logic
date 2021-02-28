package com.batch254.logic04;

import java.util.Scanner;

public class Palindrome {
    public static void Resolve()
    {


        String string, palindrome = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan  string :");
        string = input.next();
        for (int i = string.length() - 1; i >= 0; i--)
        {
            palindrome = palindrome + string.charAt(i);
        }
        System.out.println("Palindrome dari string : " + palindrome);
        if (palindrome.equals(string))
            System.out.println("String termasuk palindrome");
        else if (palindrome != (string))
            System.out.println("String yang dimasukkan bukan palindrome ");
    }
}

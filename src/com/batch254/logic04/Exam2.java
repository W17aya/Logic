package com.batch254.logic04;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {
    public static void Resolve() {



        String password;
        int i;
        int c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER PASSWORD");
        password = in.next();
        if (password.length() <= 8)
        {
            for (i = 0; i <= password.length(); i++)
            {
                char x = password.charAt(i);
                if (Character.isLetter(x))
                {
                    if (Character.isDigit(x))
                        c = 1;
                }
            }
            if (c == 1)
                System.out.println("STRONG");
            else
                System.out.println("NOT STRONG");
        }
        else
            System.out.println("HAVE AT LEAST 8 CHARACTERS");
    }
}
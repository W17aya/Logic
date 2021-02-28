package com.batch254.logic04;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRankInAString {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        String word = "hackerrank";
        for (int a0 = 0; a0 < q; a0++) {
            String s = input.next();
            // your code goes here
            int j = 0;
            boolean flag = true;
            for (int i = 0; i < word.length(); ++i) {
                while (word.charAt(i) != s.charAt(j)) {
                    j++;
                    if (j >= s.length()) {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    break;
                }
                j++;
                if ((j >= s.length()) && (i < word.length() - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
package com.batch254.logic04;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.S;
import static sun.text.normalizer.NormalizerImpl.convert;

public class Exam1 {
    public static void Resolve() {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int count= 0 ;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count+1);
    }
}

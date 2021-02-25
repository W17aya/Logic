package com.batch254.logic03;

import java.util.Scanner;

public class Exam08 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter set of number:");

        int n = input.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = input.nextInt();
        }

        int temp = height[0];
        for (int i = 0; i < n; i++) {
            if (temp < height[i])
                temp = height[i];
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (temp == height[i])
                count++;
        }

        System.out.println(count);
    }
}
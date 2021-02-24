package com.batch254.logic3;


import java.util.*;

public class Exam04 {
    public static void Resolve() {
        Scanner in = new Scanner(System.in);
        final int N = Integer.parseInt(in.nextLine());
        long diff = 0;
        for(int i=0; i < N; i++) {
            String[] row = in.nextLine().split(" ");
            diff += (Integer.parseInt(row[i]) - Integer.parseInt(row[N - 1 - i]));
        }

        System.out.println(Math.abs(diff));

        in.close();
    }
}
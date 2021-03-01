package com.batch254.Tes;

import java.util.Arrays;
import java.util.Scanner;

public class NinjaHatori {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);
        System.out.println("N=Naik || T: Turun");
        System.out.println("Masukkan jumlah gerakan:");
        int n = input.nextInt();

        String langkah = input.next();

        int[]position = new int[n];

        int count = 0;


        for (int i = 0; i < n; i++) {
            if (langkah.charAt(i)== 'T' ) {
                count--;
            }
            else if (langkah.charAt(i) =='N') {
                count++;
            }
            position[i] = count;
        }

        System.out.println(Arrays.toString(position));

        int lembah  = 0;
        int gunung = 0;

        for (int i = 1; i <n; i++) {
            if (position[i-1] ==-1  && position[i] == 0)
            {
                lembah++;
            }
            else if (position[i-1] ==+1  && position[i] == 0)
            {
                gunung++;
            }
        }
        System.out.println("Lembah :" + lembah);
        System.out.println("Gunung :" + gunung);

    }
}

package com.batch254.PreTest;

import java.util.Arrays;
import java.util.Scanner;

public class Soal01 {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("N=Jalan|| W=Lompat");
        System.out.println("Masukkan Pola lintasan:");
        int length = input.nextInt();
        System.out.println("Inputan Cara jalan:");

        String langkah = input.next();



        int[] position = new int[length];

        int Energi = 0;


        for (int i = 0; i < length; i++) {
            if (langkah.charAt(i) == 'W') {
                Energi--;
            } else if (langkah.charAt(i) == 'J') {
                Energi++;
            }
            position[i] = Energi;
        }

        System.out.println(Arrays.toString(position));

        int EnergiAkhir = 0;

        for (int i = 1; i < length; i++) {
            if (position[i - 1] == -1 && position[i] == 0) {
                EnergiAkhir++;
            } else if (position[i - 1] == +1 && position[i] == 0) {
                System.out.println("Jim died");
            }
        }
        System.out.println("Energi akhir:" + Energi);

    }
}

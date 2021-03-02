package com.batch254.PreTest;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // Generates random integers 0 to 49
        int x = random.nextInt(9);


        System.out.println("1. Player Main Dahulu || 2. Komputer main terlebih dahulu");
        System.out.println("Masukan pilihan: ");
        int question = input.nextInt();

        input.nextLine();

        switch (question) {
            case 1:

                System.out.println("Angka Anda:");
                int length = input.nextInt();

                // Prints random integer values
                System.out.println("Angka Komputer:");
                System.out.println(x);

                if (length > x) {
                    System.out.println("YOU WIN");
                } else {
                    System.out.println("YOU LOSE");
                }
                break;
            case 2:


                System.out.println("Angka Anda:");
                int angkaAnda = input.nextInt();


                if (angkaAnda > x) {
                    System.out.println("YOU WIN");
                    System.out.println("Angka Komputer:");
                    System.out.println(x);
                } else {
                    System.out.println("YOU LOSE");
                    // Prints random integer values
                    System.out.println("Angka Komputer:");
                    System.out.println(x);

                    break;
                }

        }

    }
}

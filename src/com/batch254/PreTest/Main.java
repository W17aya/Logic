package com.batch254.PreTest;

import com.batch254.Tes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // untuk input
        Scanner input = new Scanner(System.in);

        String answer = "Y";

        while (answer.toUpperCase().equals("Y")) {
            System.out.println("MASUKAN NOMOR SOAL: ");
            int question = input.nextInt();

            //untuk skip bug input Scanner
            input.nextLine();

            switch (question) {
//                case 1:
//                    Soal01.Resolve();
//                    break;
//                case 2:
//                    Soal02.Resolve();
//                break;
//                case 3:
//                    Soal03.Resolve();
//                    break;
                case 4:
                    Soal04.Resolve();
                    break;
//                case 5:
//                    Soal05.Resolve();
//                    break;
                case 6:
                    Soal06.Resolve();
                    break;
                case 7:
                    Soal07.Resolve();
//                break;
//                case 8:
//                    Soal08_Delivery.Resolve();
//                    break;
//                case 9:
//                    Soal09_Ovo.Resolve();
//                    break;
//                case 10:
//                    Soal10_NinjaHatori.Resolve();
//                    break;
                default:
                    System.out.println("SOAL TIDAK DITEMUKAN");
                    break;
            }

            System.out.println("LANJUTKAN?");
            answer = input.nextLine();

        }
    }
}
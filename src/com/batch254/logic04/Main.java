package com.batch254.logic04;

import BirthdayCakeCandle.Exam08;
import com.batch254.logic03.*;

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
                case 1:
                    Exam1.Resolve();
                    break;
                case 2:
                    Exam2.Resolve();
                    break;
                case 3:
                    Exam3.Resolve();
                    break;
//                case 4:
//                    Exam4.Resolve();
            //        break;
//                case 5:
//                    PlusMinus.Resolve();
//                    break;
//                case 6:
//                    Staircase.Resolve();
//                    break;
//                case 7:
//                    MiniMaxSum.Resolve();
//                    break;
//                case 8:
//                    Exam08.Resolve();
//                    break;
////                case 9:
////                    Exam09.Resolve();
////                    break;
////                case 10:
////                    Exam10.Resolve();
////                    break;
//                case 11:
//                    Sorting.Resolve();
//                    break;
                case 12:
                    Exam12.Resolve();
                    break;

                default:
                    System.out.println("SOAL TIDAK DITEMUKAN");
                    break;
            }

            System.out.println("LANJUTKAN?");
            answer = input.nextLine();

        }
    }
}
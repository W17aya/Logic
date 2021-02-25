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
                    SolveMeFirst.Resolve();
                    break;
//                case 2:
//                    Exam02.Resolve();
//                    break;
                case 3:
                    SimpleArraySum.Resolve();
                    break;
                case 4:
                    DiagonalDifference.Resolve();
                    break;
                case 5:
                    PlusMinus.Resolve();
                    break;
                case 6:
                    Staircase.Resolve();
                    break;
                case 7:
                    MiniMaxSum.Resolve();
                    break;
                case 8:
                    Exam08.Resolve();
                    break;
//                case 9:
//                    Exam09.Resolve();
//                    break;
//                case 10:
//                    Exam10.Resolve();
//                    break;
                case 11:
                    Sorting.Resolve();
                    break;
                case 12:
                    Mean.Resolve();
                    break;
                 case 13:
                    Median.Resolve();
                    break;
                case 14:
                    Modus.Resolve();
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
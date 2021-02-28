package com.batch254.logic06;

import com.batch254.logic05.FindTheMedian;
import com.batch254.logic05.SortingAlphabets;

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
//                    Exam1.Resolve();
//                    break;
//                case 2:
//                    Exam2.Resolve();
//                    break;
//                case 3:
//                    Exam3.Resolve();
//                    break;
////                case 4:
////                    Exam4.Resolve();
////                    break;
                case 5:
                    SortingAlphabets.Resolve();
                    break;
//                case 6:
//                    Exam6.Resolve();
//                    break;
                case 7:
                    FindTheMedian.Resolve();
                    break;
////                case 8:
////                    Exam08.Resolve();
////                    break;
//                case 9:
//                    Exam9.Resolve();
//                    break;
//////                case 10:
//////                    Exam10.Resolve();
//////                    break;
//                case 11:
//                    Exam11.Resolve();
//                    break;
//                case 12:
//                    Exam12.Resolve();
//                    break;
////                    case 13;
////                    Exam13.Resolve();
////                    break;

                default:
                    System.out.println("SOAL TIDAK DITEMUKAN");
                    break;
            }

            System.out.println("LANJUTKAN?");
            answer = input.nextLine();

        }
    }
}
package com.batch254.logic04;

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
                    CamelCase.Resolve();
                    break;
                case 2:
                    StrongPassword.Resolve();
                    break;
                case 3:
                    CaesarCipher.Resolve();
                    break;
                case 4:
                    MarsExploration.Resolve();
                    break;
                case 5:
                    HackerRankInAString.Resolve();
                    break;
                case 6:
                    Pangrams.Resolve();
                    break;
//                case 7:
//                    MiniMaxSum.Resolve();
//                    break;
//                case 8:
//                    Exam08.Resolve();
//                    break;
                case 9:
                    MakingAnagrams.Resolve();
                    break;
////                case 10:
////                    Exam10.Resolve();
////                    break;
                case 11:
                    Asteriks.Resolve();
                    break;
                case 12:
                    Palindrome.Resolve();
                    break;
//                    case 13;
//                    Exam13.Resolve();
//                    break;
                case 14:
                    Boolean.Resolve();
                    break;
//                case 15:
//                    PasswordKuat.Resolve();
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
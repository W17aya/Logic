package com.batch254.logic02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // untuk input
        Scanner input = new Scanner(System.in);

        String answer = "Y";

         while (answer.toUpperCase().equals("Y"))
         {
             System.out.println("MASUKAN NOMOR SOAL: ");
             int question = input.nextInt();

             //untuk skip bug input Scanner
             input.nextLine();

             switch (question) {
                case 1:
                    Exam01.Resolve();
                    break;
                 case 2:
                     Exam02.Resolve();
                     break;
                 case 3:
                     Exam03.Resolve();
                     break;
                 case 4:
                     Exam04.Resolve();
                     break;
                 case 5:
                     Exam05.Resolve();
                     break;
                 case 6:
                     Exam06.Resolve();
                     break;
                 case 7:
                     Exam07.Resolve();
                     break;
                 case 8:
                     Exam08.Resolve();
                     break;
                 case 9:
                     Exam09.Resolve();
                     break;
                 case 10:
                     Exam10.Resolve();
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
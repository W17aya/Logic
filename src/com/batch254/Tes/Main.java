package com.batch254.Tes;

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
                    Belanja.Resolve();
                    break;
                case 2:
                    Parkir.Resolve();
                break;
                case 3:
                    Porsi.Resolve();
                    break;
                case 4:
                    Konversi.Resolve();
                    break;
                case 5:
                    KertasHVS.Resolve();
                    break;
                case 6:
                    OnlineShop.Resolve();
                    break;
                case 7:
                    Alphabets.Resolve();
                break;
                case 8:
                    Delivery.Resolve();
                    break;
                case 9:
                    Ovo.Resolve();
                    break;
                case 10:
                    NinjaHatori.Resolve();
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
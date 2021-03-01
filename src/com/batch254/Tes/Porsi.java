package com.batch254.Tes;

import java.util.Scanner;

public class Porsi {
    public static void Resolve() {
        System.out.println("Latihan soal 03 porsi");
        Scanner input = new Scanner(System.in);

        //variabel
        //porsi berdasarkan umur
        int porsiPria = 2;
        int porsiWanita = 1;
        int porsiRemaja = 1;
        int porsiBalita = 1;
        double porsiAnak = 0.5;
        int totalPorsi = 0;
        //nilai awal masing-masing orang
        int banyakPria = 0;
        int banyakWanita = 0;
        int banyakBalita = 0;
        int banyakRemaja = 0;
        double banyakanak = 0;


        //input
        String lagi = "";
        do {
            System.out.println("Pilih umur");
            System.out.println("1. Jumlah pria dewasa");
            System.out.println("2. Jumlah wanita dewasa");
            System.out.println("3. Jumlah remaja");
            System.out.println("4. Jumlah anak");
            System.out.println("5. balita");
            System.out.print("Nomor pilihan : ");
            int pilihan = input.nextInt();
            System.out.println("Jumlah orang : ");

            switch (pilihan) {
                case 1:
                    banyakPria = banyakPria + input.nextInt();
                    break;
                case 2:
                    banyakWanita = banyakWanita + input.nextInt();
                    break;
                case 3:
                    banyakRemaja = banyakRemaja + input.nextInt();
                    break;
                case 4:
                    banyakanak = banyakanak + input.nextInt();
                    break;
                case 5:
                    banyakBalita = banyakBalita + input.nextInt();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
            System.out.println("Input lagi y/n ?");
            lagi = input.nextLine();
        }while (lagi.equals("y") || lagi.equals("Y"));
        int totalOrang = (int) banyakanak + banyakBalita + banyakPria + banyakWanita + banyakRemaja;

        if ((totalOrang > 5) && (totalOrang % 2 != 0)){
            porsiWanita++;
        }
        totalPorsi = (porsiPria*banyakPria) + (porsiWanita*banyakWanita) + (porsiRemaja*banyakRemaja) +
                (int) (Math.floor(porsiAnak*banyakanak)) + (porsiRemaja*banyakRemaja) + (porsiBalita*banyakBalita);
        System.out.println(totalPorsi + "porsi");

    }
}
package com.batch254.Tes;

import java.util.Scanner;

public class Konversi {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        double cangkir = 1;
        double gelas = 2.5 * cangkir;
        double teko = 25 * cangkir;
        double botol = 5 * cangkir;//2 * gelas


        double konversiTeko = 0;
        double konversiBotol = 0;
        double konversiGelas = 0;
        double konversiCangkir = 0;

        System.out.println("Silakan pilih nomor");
        System.out.println("1. teko");
        System.out.println("2. botol");
        System.out.println("3. gelas");
        System.out.println("4. cangkir");
        System.out.print("\nMasukkan pilihan: ");
        String konversi = input.nextLine();


        if (konversi.equals("1")) {//teko
            System.out.println("\nSilakan pilih nomor");
            System.out.println("1. teko -> botol");
            System.out.println("2. teko -> gelas");
            System.out.println("3. teko -> cangkir");
            System.out.print("\nMasukkan pilihan: ");
            String tekoString = input.nextLine();

            if (tekoString.equals("1")) {// 1 teko = ... botol
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiTeko = angka * (teko / botol);
                System.out.println(angka + " teko = " + konversiTeko + " botol");
            } else if (tekoString.equals("2")) {// 1 teko = ... gelas
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiTeko = angka * (teko / gelas);
                System.out.println(angka + " teko = " + konversiTeko + " gelas");
            } else if (tekoString.equals("3")) {// 1 teko = ... cangkir
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiTeko = angka * teko;
                System.out.println(angka + "teko = " + konversiTeko + " cangkir");
            }

        } else if (konversi.equals("2")) {//botol
            System.out.println("\nSilakan pilih nomor");
            System.out.println("1. botol -> teko");
            System.out.println("2. botol -> gelas");
            System.out.println("3. botol -> cangkir");
            System.out.print("\nMasukkan pilihan: ");
            String botolString = input.nextLine();

            if (botolString.equals("1")) {// 1 botol = ... teko 0.2
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiBotol = angka * (botol / teko);
                System.out.println(angka + " botol = " + konversiBotol + " teko");
            } else if (botolString.equals("2")) {// 1 botol = ... gelas
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiBotol = angka * botol;
                System.out.println(angka + " botol = " + konversiBotol + " gelas");
            } else if (botolString.equals("3")) {// 1 botol = ... cangkir
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiBotol = angka * gelas * 2;
                System.out.println(angka + " botol = " + konversiBotol + " cangkir");
            }
        } else if (konversi.equals("3")) {
            System.out.println("\nSilakan pilih nomor");
            System.out.println("1. gelas -> cangkir");
            System.out.println("2. gelas -> botol");
            System.out.println("3. gelas -> teko");
            System.out.print("\nMasukkan pilihan: ");
            String gelasString = input.nextLine();

            if (gelasString.equals("1")) {// 1 gelas = ... cangkir
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiGelas = angka * gelas;
                System.out.println(angka + " gelas = " + konversiGelas + " cangkir");
            } else if (gelasString.equals("2")) {// 1 gelas = ... botol
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiGelas = angka * (gelas / botol);
                System.out.println(angka + "gelas = " + konversiGelas + " botol");
            } else if (gelasString.equals("3")) {// 1 gelas = ... teko
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiGelas = angka * (gelas / teko);
                System.out.println(angka + " gelas = " + konversiGelas + " teko");
            }
        } else if (konversi.equals("4")) {//cangkir
            System.out.println("\nSilakan pilih nomor");
            System.out.println("1. cangkir -> gelas");
            System.out.println("2. cangkir -> botol");
            System.out.println("3. cangkir -> teko");
            System.out.print("\nMasukkan pilihan: ");
            String cangkirString = input.nextLine();

            if (cangkirString.equals("1")) {// 1 cangkir = ... gelas
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiCangkir = angka * (cangkir / gelas);
                System.out.println(angka + " cangkir = " + konversiCangkir + " gelas");
            } else if (cangkirString.equals("2")) {// 1 cangkir = ... botol
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiCangkir = angka * (cangkir / botol);
                System.out.println(angka + " cangkir = " + konversiCangkir + " botol");
            } else if (cangkirString.equals("3")) {// 1 cangkir = ... teko
                System.out.print("Masukkan angka: ");
                double angka = input.nextDouble();
                System.out.println(" ");
                konversiCangkir = angka * (cangkir / teko);
                System.out.println(angka + " cangkir = " + konversiCangkir + " teko");
            }

        }

    }
}
package com.batch254.PreTest;

import com.batch254.Tes.Utility;

import java.util.Arrays;
import java.util.Scanner;

public class Soal04 {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);


        int BiayaAdmin = 7500;
        System.out.println("Masukkan Pin");
        int inputPin = input.nextInt();


        if (inputPin == 123456) {
            System.out.println("Uang yang disetor: ");
            int saldo = input.nextInt();
            System.out.println("1. Antar Rekening || 2. Antar Bank");
            System.out.println("Pilihan Transfer");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("Masukkan rekening tujuan:");
                int RekTujuan = input.nextInt();
                System.out.println("Masukkan nominal transfer:");
                int Nominal = input.nextInt();

                int SaldoAwal = saldo;

                int SaldoAkhir = SaldoAwal - Nominal;
                System.out.println("Transaksi berhasil, saldo anda saat ini " + SaldoAkhir);
            }
            if (pilihan == 2) {

                System.out.println("Masukkan kode bank: ");
                int KodeBank = input.nextInt();
                System.out.println("Masukkan rekening tujuan: ");
                int RekeningTujuan = input.nextInt();
                System.out.println("Masukkan nominal transfer: ");
                int NominalTransfer = input.nextInt();

                int SaldoAwal = saldo;
                int SaldoAkhir = SaldoAwal - NominalTransfer - BiayaAdmin;
                System.out.println("Transaksi berhasil, saldo anda saat ini " + SaldoAkhir);

            }
        } else if (inputPin != 123456) {
            System.out.println("PIN SALAH");

        }
    }
}


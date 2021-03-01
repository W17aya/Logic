package com.batch254.Tes;

import java.util.Scanner;

public class Ovo {
    public static void Resolve(){
            Scanner input = new Scanner(System.in);

            System.out.println("Masukkan saldo : ");
            int saldo = input.nextInt();

            int hargaKopi = 18000;
            int discount = 0;
            int minOrder = 40000;
            int jumlahCup = 0;
            int saldoAkhirTanpaCashback = 0;
            int saldoAkhir = 0;
            if (saldo < hargaKopi) {
                System.out.println("Uang tidak cukup");
            } else if (saldo >= minOrder) {
                discount = (saldo * 50) / 100;
                if (discount > 100000){
                    System.out.println("Tidak jadi beli");
                }
                else{
                    hargaKopi = hargaKopi / 2;
                    jumlahCup = saldo / hargaKopi;
                    saldoAkhirTanpaCashback = saldo - (jumlahCup * hargaKopi);
                    saldoAkhir = saldoAkhirTanpaCashback + (((jumlahCup * hargaKopi) * 10) / 100);
                }
            } else {
                jumlahCup = saldo / hargaKopi;
                saldoAkhirTanpaCashback = saldo - (jumlahCup * hargaKopi);
                saldoAkhir = saldoAkhirTanpaCashback + (saldoAkhirTanpaCashback * 10) / 100;
            }
            System.out.println("Cup yang didapat : " + jumlahCup);
            System.out.println("Saldo akhir : "+ saldoAkhir);
        }
    }


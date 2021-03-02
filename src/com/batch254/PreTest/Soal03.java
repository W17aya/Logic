//package com.batch254.PreTest;
//
//import com.batch254.Tes.Utility;
//
//import java.util.Scanner;
//
//public class Soal03 {
//    public static void Resolve()
//    {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Masukkan jumlah kartu : ");
//        int kartu = input.nextInt();
//        input.nextLine();
//        System.out.println("Masukkan jumlah tawaran : ");
//        String JumlahTawaran = input.nextLine();
//        System.out.println("Pilih Kotak : ");
//        String PilihanKotak = input.nextLine();
//
//
//        int temporary = 0;
//        int pembanding = 0;
//        for (int i = 0; i < baju.length; i++) {
//            for (int j = 0; j < celana.length; j++) {
//                if (baju.length > 3 || celana.length > 3 ){
//                    System.out.println("inputan tidak sesuai");
//                    break;
//                }
//                else{
//                    pembanding = baju[i] + celana[j];
//                    if (pembanding <= kartu && temporary < pembanding ){
//                        temporary = pembanding;
//                    }
//                }
//
//            }
//        }
//        System.out.println(temporary);
//    }
//}

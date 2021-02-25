//package com.batch254.logic03;
//
//import java.util.Scanner;
//
//public class Modus {
//    public static void Resolve() {
//
//        Scanner input = new Scanner(System.in);
//        int banyak;
//
//        int data[];
//
//        int x = 0;
//
//        int y = 0;
//
//        int a = 0;
//
//        int b = 0;
//
//        int jumlah = 0;
//
//
//        // Mendeklarasikan sebuah array satu dimensi.
//
//        System.out.print("Banyaknya Data : ");
//
//        banyak = input.nextInt(); //Menginisialisai array.
//
//        data = new int[banyak]; //Mengakses nilai array dengan index tertentu.
//
//        for(int i=0;i<=banyak-1;i++){ //Proses perulangan.
//
//            System.out.print("Data ke-"+(i+1)+" : ");
//
//            data[i]= input.nextInt(); //Mengisi & Menampilkan isi array ke layar.
//
//        }
//
//
//
//        // Mengurutkan nilai array yang sudah dimasukkan.
//
//        System.out.print("Mengurutkan Data : ");
//
//        for(int i=0; i<=banyak-1; i++){ //Proses Perulangan.
//
//            System.out.print(data[i]+" "); //Memanggil & menampilkan nilai array.
//
//            jumlah = jumlah + data[i];
//
//        }
//
//        System.out.println("Jumlah Keseluruhan Data = "+jumlah);
//
//        jumlah=jumlah; //Menampilkan hasil jumlah antar array
//
//
//
//        // Mencari nilai MODUS dengan cara membandingkan.
//
//        for (int i=0; i<data.length ;i++){ //Proses perulangan
//
//            if(data[i]==banyak){
//
//                System.out.print(data[i]+" ");
//
//                System.out.println(++x);
//
//                a=x;
//
//            }
//
//            else{
//
//                System.out.print(data[i]+" ");
//
//                System.out.println(++y);
//
//                b=y;
//
//                b=data[i];
//
//            }
//
//        }
//
//        if(a<=b){
//
//            a=banyak;
//
//            System.out.println("Modus = "+a);
//
//        }
//
//        else{
//
//            System.out.println("Modus = "+b);
//
//        }
//
//
//
//    }
//
//}
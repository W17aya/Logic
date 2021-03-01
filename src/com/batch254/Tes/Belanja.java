package com.batch254.Tes;

import  com.batch254.Tes.Utility;


import java.util.Scanner;

public class Belanja {
    public static void Resolve (){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah uang : ");
        int uang = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan harga baju : ");
        String inputBaju = input.nextLine();
        System.out.println("Masukkan harga celana : ");
        String inputCelana = input.nextLine();

        int[] baju = Utility.StringToArrayInt(inputBaju);
        int[] celana = Utility.StringToArrayInt(inputCelana);

        int temp = 0;
        int max = 0;
        int pembanding = 0;
        for (int i = 0; i < baju.length; i++) {
            for (int j = 0; j < celana.length; j++) {
                if (baju.length > 3 || celana.length > 3 ){
                    System.out.println("inputan tidak sesuai");
                    break;
                }
                else{
                    pembanding = baju[i] + celana[j];
                    if (pembanding <= uang && temp < pembanding ){
                        temp = pembanding;
                    }
                }

            }
        }
        System.out.println(temp);
    }
}

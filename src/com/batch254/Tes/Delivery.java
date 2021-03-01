package com.batch254.Tes;

import java.util.Arrays;
import java.util.Scanner;

public class Delivery {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Tentukan lokasi yang dipilih : ");
        String lokasi = input.nextLine();

        int[] arrayInput = Utility.StringToArrayInt(lokasi);

//        for(int i = 0; i < lokasi.length(); i++){
//            System.out.println(arrayInput[1]);
//        }
        double bensin = 0.4;
        double tokoLokasi1 = 2;
        double tokoLokasi2 = 2.5;
        double tokoLokasi3 = 4;
        double tokoLokasi4 = 6.5;
        double jarakTotal = 0;
        double bensinUsed = 0;
        int temp = 0;

        Arrays.sort(arrayInput);
        int number = arrayInput[arrayInput.length-1];

//        if (arrayInput[1] + 1 == 1) {
//            jarakTotal = tokoLokasi1 + tokoLokasi1;
//            bensinUsed = jarakTotal * bensin;
//            System.out.println(bensinUsed + " liter");
//        } else if (arrayInput[2] + 1 == 2) {
//            jarakTotal = tokoLokasi1 + tokoLokasi1;
//            bensinUsed = jarakTotal * bensin;
//            System.out.println(bensinUsed + " liter");
//        } else if (arrayInput[3] + 1 == 3) {
//            jarakTotal = tokoLokasi1 + tokoLokasi1;
//            bensinUsed = jarakTotal * bensin;
//            System.out.println(bensinUsed + " liter");
//        } else if (arrayInput[4] + 1 == 4) {
//            jarakTotal = tokoLokasi1 + tokoLokasi1;
//            bensinUsed = jarakTotal * bensin;
//            System.out.println(bensinUsed + " liter");
//        }
        switch (number){
            case 1:
                jarakTotal = tokoLokasi1+tokoLokasi1;
                bensinUsed = jarakTotal * bensin;
                System.out.println(bensinUsed + " liter");
                break;
            case 2:
                jarakTotal = tokoLokasi2 + tokoLokasi2;
                bensinUsed = jarakTotal * bensin;
                System.out.println(bensinUsed + " liter");
                break;
            case 3:
                jarakTotal = tokoLokasi3 + tokoLokasi3;
                bensinUsed = jarakTotal * bensin;
                System.out.println(bensinUsed + " liter");
                break;
            case 4:
                jarakTotal = tokoLokasi4 + tokoLokasi4;
                bensinUsed = jarakTotal * bensin;
                System.out.println(bensinUsed + " liter");
                break;
        }
    }
}


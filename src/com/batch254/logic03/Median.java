//package com.batch254.logic03;
//import java.util.Arrays;
//import java.util.Scanner;
//public class Median {
//    public static void Resolve() {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Input Nilai : ");
//        String text = input.nextLine();
//        int[] number = Utility.StringToArrayInt(text);
//        int tempt= 0;
//
//        //looping sorting
//        for (int i = 0; i < number.length; i++) {
//            for (int j = i + 1; j < number.length; j++) {
//                if ( number[i] > number[j])
//                {
//                    tempt = number[i];
//                    i = number[j];
//                    number[j] = tempt;
//
//                }
//            }
//        }
//
//
//        //mencari median
//        double median1 = number[number.length / 2];
//        double median2 = (number[number.length/2] + number[(number.length/2) - 1]) / 2;
//        if (number.length % 2 != 0)
//        {
//            System.out.println("Nilai Median : " + median1);
//        }
//        else
//        {
//            System.out.println("Nilai Median : " + median2);
//        }
//    }
//}
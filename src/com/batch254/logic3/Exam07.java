//package com.batch254.logic3;
//
//
//import java.util.Scanner;
//
//
//public class Exam07 {
//
//    public static void Resolve() {
//
//            Scanner in = new Scanner(System.in);
//
//            sout
//
//            long min = Long.MAX_VALUE;
//            long max = 0;
//            long sum = 0;
//            for(int i=0; i<5; i++)
//            {
//                long curr = in.nextLong();
//                if(max < curr)
//                {
//                    max = curr;
//                }
//                if(min > curr)
//                {
//                    min = curr;
//                }
//
//                sum += curr;
//            }
//            long minSum = sum - max;//Removes the largest of the 5 numbers to get the min sum
//            long maxSum = sum - min;//Removes the smallest of the 5 numbers to get the max sum
//            System.out.println(minSum + " " + maxSum);
//        }
//
//    }
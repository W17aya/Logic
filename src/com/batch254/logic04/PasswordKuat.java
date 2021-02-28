//package com.batch254.logic04;
//
//import java.util.Scanner;
//
//public class PasswordKuat {
//    public static void Resolve(){
//
//
//        String numbers = "0123456789";
//        String lower_case = "abcdefghijklmnopqrstuvwxyz";
//        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String special_characters = "!@#$%^&*()-+";
//
//        boolean num = false;
//        boolean lower = false;
//        boolean upper = false;
//        boolean special = false;
//        for(int i=0; i<password.length(); i++){
//            char c = password.charAt(i);
//            if(numbers.indexOf(c) != -1){
//                num = true;
//            }
//            if(lower_case.indexOf(c) != -1){
//                lower = true;
//            }
//            if(upper_case.indexOf(c) != -1){
//                upper = true;
//            }
//            if(special_characters.indexOf(c) != -1){
//                special = true;
//            }
//        }
//
//        int miss = 0;
//        if(!num) miss++;
//        if(!lower) miss++;
//        if(!upper) miss++;
//        if(!special) miss++;
//
//        return Math.max(6-n, miss);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String password = in.next();
//        int answer = minimumNumber(n, password);
//        System.out.println(answer);
//        in.close();
//    }
//}
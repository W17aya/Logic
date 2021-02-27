package com.batch254.logic04;

import java.util.Scanner;

public class Exam2 {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        //input password
        System.out.println("Input password: ");
        String password = input.nextLine();

        //inisialisai variabel
        int panjangPassword = 6;
        int numbers = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int specialCharacters = 0;

//        numbers = "0123456789"; //48-57 lebih dari sama dengan dan kurang dari sama dengan
//        lowerCase = "abcdefghijklmnopqrstuvwxyz"; //97-122
//        upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //65-90
//        specialCharacters = "!@#$%^&*()-+"; //33-467

        for (int i = 0; i < password.length(); i++) {
            //jika password lebih dari sama dengan 48 dan kurang dari sama dengan 57 maka dia memenuhi syarat numbers
            if ((password.charAt(i) >= 48) && (password.charAt(i) <= 57)) {
                numbers = 1;
            }
            //jika password lebih dari sama dengan 97 dan kurang dari sama dengan 122 maka dia memenuhi syarat lowerCase
            if ((password.charAt(i) >= 97) && (password.charAt(i) <= 122)) {
                lowerCase = 1;
            }
            //jika password lebih dari sama dengan 65 dan kurang dari sama dengan 90 maka dia mememuhi syarat upperCase
            if ((password.charAt(i) >= 65) && (password.charAt(i) <= 90)) {
                upperCase = 1;
            }
            if ((password.charAt(i) >= 33) && (password.charAt(i) <= 467)) {
                specialCharacters = 1;
            }
        }

        if (password.length() < panjangPassword) {
            int length = panjangPassword - password.length();
            System.out.println("Panjang password adalah: " + password.length() + " Paswword kurang strong " + numbers + lowerCase + upperCase + specialCharacters);
        } else if (numbers == 0) {
            System.out.println("Password kurang strong karena password tidak memenuhi numbers");
        } else if (lowerCase == 0) {
            System.out.println("Password kurang strong karena password tidak memenuhi lowerCase");
        } else if (upperCase == 0) {
            System.out.println("Password kurang strong karena password tidak memenuhi upperCase");
        } else if (specialCharacters == 0) {
            System.out.println("Password kurang strong karena password tidak memenuhi specialCharacters");
        } else {
            System.out.println("Password strong");
        }


//            if(str.charAt(i) != arrayUpperCase[i]) {
//                System.out.println("Password kurang strong karena password tidak memenuhi upperCase");
//            }
//            if(str.charAt(i) != arraySpecialCharacters[i]){
//                System.out.println("Password kurang strong karena password tidak memenuhi specialCharacters");
//            }
        //}
        //ketika ada password baru deteksi apakah password tsb kuat apa tidak

    }
}
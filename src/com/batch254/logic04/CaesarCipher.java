package com.batch254.logic04;

import java.util.Scanner;

public class CaesarCipher {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);

        System.out.println(" Input plaintext : ");
        String plaintext = input.nextLine();

        System.out.println(" Input Value Rotasi : ");
        int shift = input.nextInt();
        String ciphertext = "";
        char alphabet;

        for (int i = 0; i < plaintext.length(); i++) {
            // Shift one character at a time
            alphabet = plaintext.charAt(i);

            // if alphabet lies between a and z
            if (alphabet >= 'a' && alphabet <= 'z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                // if shift alphabet greater than 'z'
                if (alphabet > 'z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            }

            // if alphabet lies between 'A'and 'Z'
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);

                // if shift alphabet greater than 'Z'
                if (alphabet > 'Z') {
                    //reshift to starting position
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println(" ciphertext : " + ciphertext);
    }
}

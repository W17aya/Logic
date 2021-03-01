package com.batch254.Tes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alphabets {
    public static void Resolve() {


        Scanner s = new Scanner(System.in);
        System.out.print("Enter  String : ");
        String input = s.next();

        char[] charArray = input.toCharArray();
        List<Character> VocalList = new ArrayList<>();
        List<Character> KosonanList = new ArrayList<>();
        int temporary;
        int arr = charArray.length;
        for (int i = 0; i < arr; i++) {
            for (int j = i + 1; j < arr; j++) {
                if (charArray[i] > charArray[j]) {
                    temporary = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) temporary;
                }
            }
        }
        for (int i = 0; i < arr; i++) {
            for (int j = 0; j < charArray[i]; j++) {

            }
        }
        System.out.println("Setelah Di urutkan menjadi : " + Arrays.toString(charArray));


        for (char ch : charArray) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                VocalList.add(ch);// tambah ke dalam vocal
            } else {
                KosonanList.add(ch);// tambah ke dalam konsonan
            }
        }

        System.out.print("Vocal di dalam string : ");
        for (char c : VocalList)
            System.out.print(c + " ");
        System.out.println(" ");


        System.out.print("konsonan di dalam string: ");
        for (char c : KosonanList)
            System.out.print(c + " ");
        System.out.println(" ");
    }
}

package com.batch254.logic03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {
    public static void Resolve() {

        Scanner input = new Scanner (System.in);

        //proses input waktu
        System.out.println("Input Waktu, Ex 07:05:45PM or 07:05:45AM: ");
        String waktu = input.nextLine();

        String[] arrayString = waktu.split(":");

        //format input waktu
        String jam = arrayString[2].replaceAll("[^a-zA-Z]+", "");
        String menit = arrayString[1];
        String detik = arrayString[2].replaceAll("[^-?0-9]+", "");
        String output;

        if (jam.toUpperCase().equals("AM"))
        {
            System.out.println(arrayString[0] + ":" + menit + ":" + detik);
        } else {
            int hour = Integer.parseInt(arrayString[0]);

            int newFormat = hour + 12;

            if (newFormat == 24)
            {
                output = "00:" + menit + ":" + detik;
            } else {
                output = newFormat + ":" + menit + ":" + detik;
            }
            System.out.println(output);
        }

    }
}
package com.batch254.Tes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Parkir {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("========== Parkir ==========");
        System.out.println("============================");

        System.out.print("Input date in, Ex. 28 Jan 21 07:30:34: ");
        String in = input.nextLine();

        System.out.print("Input date out, Ex. 28 Jan 21 07:30:34: ");
        String out = input.nextLine();

//        String in = "28 Jan 21 07:30:34";
//        String out = "29 Jan 21 20:03:05";
        Date dateIn = null;
        Date dateOut = null;

        long difference;
        long hour;
        long minute;
        long second;
        long price;
        long restHour;

        String strHour;
        String strMinute;
        String strSecond;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yy hh:mm:ss");

        try {
            dateIn = dateFormat.parse(in);
            dateOut = dateFormat.parse(out);
        } catch (Exception e) {
            System.out.println("Format salah");
        }

        difference = dateOut.getTime() - dateIn.getTime();
        second = difference / 1000 % 60;
        minute = difference / (60 * 1000) % 60;
        hour = difference / (60 * 60 * 1000);
        restHour = hour - 24;

        strHour = Long.toString(hour);
        strMinute = Long.toString(minute);
        strSecond = Long.toString(second);

        if (hour < 8) {
            price = (hour * 1000) + (minute * (1000 / 60)) + (second * (1000 / (60 * 60)));
            System.out.println(price);
        } else if (hour > 8 && hour <= 24) {
            price = (hour * 8000) + (minute * (8000 / 60)) + (second * (8000 / (60 * 60)));
            System.out.println(price);
        } else {
            if (hour > 24) {
                if (restHour < 8) {
                    price = 15000 + (restHour * 1000) + (minute * (1000 / 60)) + (second * (1000 / (3600)));
                    System.out.println(price);
                } else if (restHour > 8 && restHour <= 24) {
                    price = 15000 + (restHour * 8000) + (minute * (8000 / 60)) + (second * (8000 / (3600)));
                    System.out.println(price);
                } else {
                    price = 15000 + (restHour * 1000) + (minute * (1000 / 60)) + (second * (1000 / (3600)));
                    System.out.println(price);
                }
            }
        }
    }
}
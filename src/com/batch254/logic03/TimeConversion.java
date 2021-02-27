package com.batch254.logic03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the date");
        String inputDate = input.nextLine();

        DateFormat dateFormat12 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        DateFormat dateFormat24 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date temp = null;
        String result = null;
        try {
            temp = dateFormat12.parse(inputDate);
            result = dateFormat24.format(temp);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println("Wrong Format");
        }

    }
}
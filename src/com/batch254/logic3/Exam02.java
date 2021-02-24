package com.batch254.logic3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam02 {
    public static void Resolve() {
        String input = "24/02/2021 07:05:48 PM";

        //Format of the date defined in the input String

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");

        //Desired format: 24 hour format: Change the pattern as per the need

        DateFormat outputformat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");

        Date date = null;
        String output = null;

        try {
            //Converting the input String to Date
            date = df.parse(input);

            //Changing the format of date and storing it in String
            output = outputformat.format(date);

            //Displaying the date
            System.out.println(output);

        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}

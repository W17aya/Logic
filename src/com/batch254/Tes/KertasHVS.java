package com.batch254.Tes;

import java.util.Scanner;

public class KertasHVS {
    public static void Resolve(){

        Scanner input = new Scanner(System.in);

        System.out.print("Kamu mau konvesi kertas apa? : ");
        String value = input.nextLine();

        double result = 0;
        if(value.equals("A2")){
            result = 16;
        }
        else if(value.equals("A3")){
            result = 8;
        }
        else if(value.equals("A4")){
            result = 4;
        }
        else if(value.equals("A5")){
            result = 2;
        }
        else if(value.equals("A6")){
            result = 1;
        }
        else if(value.equals("A7")){
            result = 0.5;
        }
        else if(value.equals("A8")){
            result = 0.25;
        }
        System.out.print(value);
        System.out.print(" = ");
        System.out.print(String.format("%.2f", result));
        System.out.println(" A6");

    }
}

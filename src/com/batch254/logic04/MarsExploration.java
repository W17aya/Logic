package com.batch254.logic04;

import java.util.Scanner;

public class MarsExploration {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan String: ");
        String sos = input.next();


        int HurufKurang = 0;

        for(int i = 0; i < sos.length(); i++)
        {
            if(i % 3 == 1)
            {
                if(sos.charAt(i) != 'O')
                {
                    HurufKurang++;
                }
            }
            else
            {
                if(sos.charAt(i) != 'S')
                {
                    HurufKurang++;
                }
            }
        }

        System.out.println(HurufKurang);
    }
}
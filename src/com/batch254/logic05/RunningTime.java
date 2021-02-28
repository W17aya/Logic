package com.batch254.logic05;

import java.util.Scanner;

public class RunningTime {
    public static void Resolve()
     {
        Scanner s = new Scanner(System.in);
         System.out.println("Masukkan array yang akan di hitung perpindahannya: ");
        int[] ar = new int[s.nextInt()];


        int num=0;
        ar[0]=s.nextInt();
        for(int i=1;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
            int temp=ar[i],j=i;
            for(;j>0 && ar[j-1]>temp;j--)
                ar[j]=ar[j-1];
            ar[j]=temp;
            num+=i-j;
        }
        System.out.print(num);
    }
}
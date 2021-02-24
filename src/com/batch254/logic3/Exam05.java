package com.batch254.logic3;

import javax.rmi.CORBA.Util;
import java.util.Scanner;

public class Exam05 {
    public static void Resolve() {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter set of number");


        int n = input.nextInt();
        int pos = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x > 0) {
                pos++;
            } else if (x == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println(pos / (double) n);
        System.out.println(neg / (double) n);
        System.out.println(zero / (double) n);
    }
}
//
//        PositiveAverage = Double.Valueof(positive)/Double.valueOf(value.length);
//        NegativeAverage = Double.Valueof(negative)/Double.valueOf(value.length);
//        ZeroAverage     = Double.Valueof(zero)/Double.valueOf(value.length);
//    }
//        Utility.PrintDouble(caption "Positive: ", postiveAverage);
//        Utility.PrintDouble(captoion "Negative: ",negativeAverage);
//        Utility.PrintDouble(caption "Zero: ", zeroAverage);
//
//    }



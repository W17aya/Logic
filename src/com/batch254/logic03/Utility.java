package com.batch254.logic03;

public class Utility {
    public static void PrintArray2D(int[][] array2d){
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[] StringToArrayInt (String text) {
        {
            //mengubah text string mjd array string
            //dg menghilanhkan spasi
            String[] temp = text.split(" ");
            int[] result = new int[temp.length];

            //konversi angka string ke angka integer berupa array
            for (int i = 0; i < result.length; i++) {
                result[i] = Integer.parseInt(temp[i]);
            }

            //mengembalikan hasil
            return result;
        }
    }

    public static void PrintInt(Integer request) {
        System.out.println(request);
        System.out.println("========================");
    }


//      public static void PrintInt(Integer request){
//            System.out.println(request);
//            System.out.println("=====================");
//        }
//        public static void PrintDouble(String caption, Double value)
//        {
//            System.out.print(caption);
//            System.out.printf("%.6f",value);
//            System.out.println();
        }

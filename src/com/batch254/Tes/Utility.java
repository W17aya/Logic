package com.batch254.Tes;

public class Utility {
    public static int[] StringToArrayInt(String text){
        //mengubah text string menjadi array string dengan menghilangkan spasi
        String[] temp = text.split(",");
        int[] result = new int [temp.length];

        //konfersi angka string ke angka integer berupa array
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(temp[i]);
        }
        return result;
    }
}

package com.testDemo;

public class ArrayUtil {
    private ArrayUtil(){}
    public static String  printArr(int[] arr) {
       StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i]).append(",");
            } else {
                sb.append(arr[i]);
            }

        }
        sb.append("]");

       return sb.toString();
    }
}

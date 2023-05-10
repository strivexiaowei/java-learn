package com.testDemo;

public class StringDemo1 {
    public static void main(String[] args) {
       //        StringBuilder sb = new StringBuilder("abc");
       //        sb.append('a');
       //        System.out.println(sb);
        int[] arr = {1, 2, 3, 4, 6};
        String b = ArrayUtil.printArr(arr);
        System.out.println(b);
    }
}

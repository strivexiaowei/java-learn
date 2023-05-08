package com.itgeuna.arithmeticoper;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean rs = hasNumber(arr, 5);
        System.out.println(rs);
    }

    public static boolean hasNumber(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }
}

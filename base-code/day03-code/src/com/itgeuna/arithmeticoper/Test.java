package com.itgeuna.arithmeticoper;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入男生衣服的时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入女生衣服的时髦度");
        int sheFashion = sc.nextInt();
        boolean rt = myFashion > sheFashion;
        System.out.println(rt);
    }
    public static int getSum (int a, int b) {
        return a + b;
    }
}

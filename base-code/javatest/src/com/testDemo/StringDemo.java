package com.testDemo;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str = sc.next();
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
               count0++;
           }
           if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
               count1++;
           }
           if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
               count2++;
           }
        }
        System.out.println("共有" + count0 + "个小写字母");
        System.out.println("共有" + count1 + "个大写字母");
        System.out.println("共有" + count2 + "个数字");
    }
}

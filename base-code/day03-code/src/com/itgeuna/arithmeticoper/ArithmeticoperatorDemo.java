package com.itgeuna.arithmeticoper;

import java.util.Scanner;

public class ArithmeticoperatorDemo {
    // 整数参与计算只能得到整数
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        if (temp == num) {
            System.out.println("回文数");
        }

    }
}

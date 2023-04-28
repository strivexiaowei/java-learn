package com.itgeuna.arithmeticoper;

import java.util.Scanner;

public class ArithmeticoperatorDemo {
    // 整数参与计算只能得到整数
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3位数");
        int i = sc.nextInt();
        System.out.println("个位:" + i % 10);
        System.out.println("十位:" + i / 10 % 10);
        System.out.println("百位:" + i / 100 % 10);
        byte b1 = 2;
        byte b2 = 3;
        byte bs = (byte) (b1 + b2);
        System.out.println(bs);
    }
}

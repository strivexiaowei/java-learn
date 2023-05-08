package com.testDemo;

import java.util.Random;

public class Test0 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char)(97 + i);

            } else {
                chs[i] = (char)(65 + i - 26);
            }
            System.out.print(chs[i]);
        }
        Random rd = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int rdIndex = rd.nextInt(chs.length);
            str += chs[rdIndex];
        }
        int rdNum = rd.nextInt(10);
        str += rdNum;
        System.out.println(str);
    }
}

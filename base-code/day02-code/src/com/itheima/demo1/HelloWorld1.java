package com.itheima.demo1;

import java.io.File;
import java.io.IOException;

public class HelloWorld1 {
    public static void main(String[] args) throws IOException {
        File file = new File("day02-code\\aaa");
        file.mkdirs();
        File file1 = new File(file, "a.txt");
        file1.createNewFile();
    }
}

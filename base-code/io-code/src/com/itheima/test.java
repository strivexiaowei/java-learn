package com.itheima;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file1 = new FileInputStream("C:\\Users\\NINGMEI\\Desktop\\move2.mp4");
        FileOutputStream file2 = new FileOutputStream("io-code\\copy.mp4");
        try (file1; file2) {
            byte[] bytes = new byte[1024 * 1024 * 5];
            int len;
            while ( (len = file1.read(bytes)) != -1) {
               file2.write(bytes, 0, len);
            }
            file1.close();
            file2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

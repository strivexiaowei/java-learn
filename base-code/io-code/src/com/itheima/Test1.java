package com.itheima;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String url1 = "https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369";
        String url3 = "";
        String url2 = "";
        String xs = wepCrawlar(url1);
        System.out.println(xs);
        ArrayList<String> xsList =  getData(xs, "(.{4})(，|。)", 1);
    }

    private static ArrayList<String> getData(String xs, String s, int i) {

    }

    private static String wepCrawlar(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), "UTF-8");
        int ch;
        while ((ch = isr.read()) != -1 ) {
           sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}

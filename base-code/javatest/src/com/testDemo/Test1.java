package com.testDemo;

import com.itheima.Cool;
import com.itheima.Manger;

public class Test1 {
    public static void main(String[] args) {
        Cool cl = new Cool("1", "张三", 3500);
        Manger mgr = new Manger("1", "张三", 3500, 1000);
        cl.work();
        cl.eatRice();
        mgr.work();
        mgr.eatRice();
    }
}

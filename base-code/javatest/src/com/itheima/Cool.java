package com.itheima;

public class Cool extends Employee {
    public Cool() {
    }

    public Cool(String id, String name, double wages) {
        super(id, name, wages);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}

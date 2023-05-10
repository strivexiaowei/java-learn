package com.itheima;

public class Manger extends Employee {
    private double bonus;

    public Manger(double bonus) {
        this.bonus = bonus;
    }

    public Manger(String id, String name, double wages, double bonus) {
        super(id, name, wages);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

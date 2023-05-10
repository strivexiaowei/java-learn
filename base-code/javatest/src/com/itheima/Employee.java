package com.itheima;

public class Employee {
    private String id;
    private String name;
    private double wages;

    public Employee() {
    }

    public Employee(String id, String name, double wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }
    public void work () {
        System.out.println("在工作");
    }
    public void eatRice () {
        System.out.println("吃米饭");
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return wages
     */
    public double getWages() {
        return wages;
    }

    /**
     * 设置
     * @param wages
     */
    public void setWages(double wages) {
        this.wages = wages;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", wages = " + wages + "}";
    }
}

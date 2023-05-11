package com.interfacedemo;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("狗", 3);
        dog.eat();
        dog.swim();
        System.out.println(dog.getName() + dog.getAge());
    }

}

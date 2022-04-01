package com.company;

public class Cat extends Style implements Animal {


    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void drink() {
        System.out.println("Cat is drinking");

    }
}

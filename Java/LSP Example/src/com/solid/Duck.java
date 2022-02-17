package com.solid;

public class Duck implements Bird {

    @Override
    public void fly() {
        System.out.println("com.solid.Duck is flying");
    }

    @Override
    public void walk() {
        System.out.println("com.solid.Duck is walking");
    }

    @Override
    public void layEggs() {
        System.out.println("com.solid.Duck is laying eggs");
    }
}

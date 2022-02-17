package com.solid;

public class Ostrich implements Bird{

    @Override
    public void walk() {
        System.out.println("com.solid.Ostrich is walking");
    }

    @Override
    public void layEggs() {
        System.out.println("com.solid.Ostrich is laying eggs");
    }
}

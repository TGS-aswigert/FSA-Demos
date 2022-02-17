package com.solid.finished;

public class Ostrich implements FlightlessBird {

    @Override
    public void walk() {
        System.out.println("com.solid.Ostrich is walking");
    }

    @Override
    public void layEggs() {
        System.out.println("com.solid.Ostrich is laying eggs");
    }
}

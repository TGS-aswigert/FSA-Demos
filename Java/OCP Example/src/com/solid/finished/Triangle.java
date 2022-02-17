package com.solid.finished;

public class Triangle implements Shape {
    public double base;
    public double height;

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

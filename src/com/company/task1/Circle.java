package com.company.task1;

public class Circle {
    private int r;
    public static final double PI = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    public double getSquare() {
        return PI * r * r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public static double getP() {
        return PI;
    }
}

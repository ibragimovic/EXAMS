package com.company.task1;

public class MainTask1 {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];

        for(int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
            System.out.println(i + ", R = " + circles[i].getR()
                    + ", S = " + circles[i].getSquare());
        }

        int counter = 0;
        for(int i = 0; i < circles.length; i++) {
            if(circles[i].getSquare() % 3 == 0) {
                counter++;
            }
        }

        System.out.println(counter);


    }
}

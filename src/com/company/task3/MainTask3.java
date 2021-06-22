package com.company.task3;

import java.util.ArrayList;

public class MainTask3 {
    public static void main(String[] args) {

        ArrayList<AbstractCircle> circles1 = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            circles1.add(new Apple());
        }
        Book book = new Book();
        Cola cola = new Cola();
        Backpack backpack1 = new Backpack(book, cola, circles1);



        ArrayList<AbstractCircle> circles2 = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            circles2.add(new TennisBall());
        }
        Paper paper2 = new Paper();
        BottleOfWater bottleOfWater2 = new BottleOfWater();
        Backpack backpack2 = new Backpack(paper2, bottleOfWater2, circles2);


        ArrayList<AbstractCircle> circles3 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            circles3.add(new Apple());
        }
        for(int i = 0; i < 3; i++) {
            circles3.add(new TennisBall());
        }
        Paper paper3 = new Paper();
        Cola cola3 = new Cola();
        Backpack backpack3 = new Backpack(paper3, cola3, circles3);





    }
}

package com.company.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Pepperoni pepperoni = new Pepperoni(400, 0.750, true);
        Margarita margarita = new Margarita(280, 0.600, false);
        Lafinta lafinta = new Lafinta(600, 0.380, true);

        pepperoni.make();
        margarita.make();
        lafinta.make();

        pepperoni.deliver();
        margarita.deliver();
        lafinta.deliver();



    }
}

package com.company.task2;

public class Pizza {
    private int price;
    private double weight;

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void make() {
        System.out.println("Готовиться пицца");
    }

    public void deliver(){
        System.out.println("Delivering " + toString() );//THIS is also possible to use.
        //System.out.println("Delivering " + this);
    }

    @Override
    public String toString(){
        return "Цена" + price + ",\nВес " + weight;
    }

}

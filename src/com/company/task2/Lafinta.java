package com.company.task2;

public class Lafinta extends Pizza{

    private boolean hasMushroom;

    public Lafinta(int price, double weight, boolean hasMushroom) {
        super(price, weight);
        this.hasMushroom = hasMushroom;
    }

    public boolean isHasMushroom() {
        return hasMushroom;
    }

    public void setHasMushroom(boolean hasMushroom) {
        this.hasMushroom = hasMushroom;
    }

    @Override
    public void make() {
        System.out.println("LaFinta is getting ready");
    }

    @Override
    public String toString() {
        return "LaFinta: \n" + super.toString() + "\nwith mushroom: " + hasMushroom;
    }
}

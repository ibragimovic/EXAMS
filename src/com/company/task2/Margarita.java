package com.company.task2;

public class Margarita extends Pizza{
    private boolean hasMeat;

    public Margarita(int price, double weight, boolean hasMeat) {
        super(price, weight);
        this.hasMeat = hasMeat;
    }

    public boolean getHasMeat() {
        return hasMeat;
    }

    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    @Override
    public void make() {
        System.out.println("Margarita is getting ready");
    }

    @Override
    public String toString() {
        return "Margarita:\n" + super.toString() + "\nwith meat: " + hasMeat;
    }
}

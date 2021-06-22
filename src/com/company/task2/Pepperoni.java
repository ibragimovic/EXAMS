package com.company.task2;

public class Pepperoni extends Pizza {
    private boolean isSpicy;

    public Pepperoni(int price, double weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
    }

    public boolean getIsSpicy() {
        return isSpicy;
    }

    public void setIsSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    @Override
    public void make() {
        System.out.println("Pepperoni pizza is getting ready");
    }

    @Override
    public String toString() {
        return "Pepperoni \n" + super.toString() + "\nis spicy " + isSpicy;
    }
}

package com.company.task3;

import java.util.ArrayList;

public class Backpack {
    private AbstractFlat abstractFlat;
    private AbstractCylindrical abstractCylindrical;
    private ArrayList<AbstractCircle> abstractCircles;

    public Backpack() {}

    public Backpack(AbstractFlat abstractFlat, AbstractCylindrical abstractCylindrical,
                    ArrayList<AbstractCircle> abstractCircles) {
        this.abstractFlat = abstractFlat;
        this.abstractCylindrical = abstractCylindrical;
        this.abstractCircles = abstractCircles;
    }

    public AbstractFlat getAbstractFlat() {
        return abstractFlat;
    }

    public void setAbstractFlat(AbstractFlat abstractFlat) {
        this.abstractFlat = abstractFlat;
    }

    public AbstractCylindrical getAbstractCylindrical() {
        return abstractCylindrical;
    }

    public void setAbstractCylindrical(AbstractCylindrical abstractCylindrical) {
        this.abstractCylindrical = abstractCylindrical;
    }

    public ArrayList<AbstractCircle> getAbstractCircles() {
        return abstractCircles;
    }

    public void setAbstractCircles(ArrayList<AbstractCircle> abstractCircles) {
        this.abstractCircles = abstractCircles;
    }
}

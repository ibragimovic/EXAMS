package com.company.task3;

public class TechDepartment extends Department{

    private boolean hasPC;



    public TechDepartment(String name, Book[] books, boolean hasPC) {
        super(name, books);
        this.hasPC = hasPC;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDoes technical department have computers: " + hasPC;
    }

    public TechDepartment(String name, int length, boolean hasPC) {
        super(name, length);
        this.hasPC = hasPC;
    }

    public boolean getHasPC() {
        return hasPC;
    }

    public void setHasPC(boolean hasPC) {
        this.hasPC = hasPC;
    }

}

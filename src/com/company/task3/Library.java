package com.company.task3;

public class Library {
    private String name;
    private String address;
    private Department[] departments;

    public Library(String name, String address, Department[] departments) {
        this.name = name;
        this.address = address;
        this.departments = departments;
    }

    @Override
    public String toString() {
        String departmentsString = "";
        for (Department department : this.departments) {
            departmentsString += department + "\n";
        }
        return "Library's name: "  + name + "\nAddress: " + address + "\nDepartments: \n" + departmentsString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}

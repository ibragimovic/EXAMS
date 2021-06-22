package com.company.task2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String fatherName;



    public Person () {}

    public Person(String firstName, String lastName, String fatherName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return  lastName.equals(person.lastName) &&
                firstName.equals(person.firstName) &&
                fatherName.equals(person.fatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, fatherName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}

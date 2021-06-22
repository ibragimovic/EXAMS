package com.company.task2;

import java.util.LinkedList;

public class MainTask2 {
    public static void main(String[] args) {

        LinkedList<Person> persons = new LinkedList<>();
        persons.add(new Person("Name1", "LastName1", "FatherName1"));
        persons.add(new Person("Name2", "LastName2", "FatherName2"));
        persons.add(new Person("Name3", "LastName3", "FatherName3"));

        Person person4 = new Person("Name4", "LastName4", "FatherName4");
        Person person5 = new Person("Name2", "LastName2", "FatherName2");

        try {
            addPersonToLinkedList(person4, persons);
            addPersonToLinkedList(person5, persons);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(persons);







    }

    public static  void addPersonToLinkedList(Person person, LinkedList<Person> persons) {
        if(persons.contains(person)) {
            throw new RuntimeException("Дубликат");
        } else {
            persons.add(person);
        }
    }
}

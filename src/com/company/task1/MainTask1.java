package com.company.task1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainTask1 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        HashSet<Integer> hashSet = new HashSet<>();

        for(int number : array) {
            if (number % 2 == 0) {
                hashSet.add(number);
            }
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int number : array) {
            if (number % 5 == 0 && number % 2 == 0) {
                linkedHashSet.add(number);
            }
        }

        for (int number : array) {
            if (number % 5 != 0 && number % 2 == 0) {
                linkedHashSet.add(number);
            }
        }

        System.out.println(linkedHashSet);




    }
}

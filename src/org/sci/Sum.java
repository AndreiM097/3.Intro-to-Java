package org.sci;

public class Sum {


    void display() {
        // 1. Calculate the sum of the first 100 numbers.

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + i;
        }

        System.out.println("1.The sum for the first 100 numbers is: " + sum);

        System.out.println("----------------------------------------------");
    }
}

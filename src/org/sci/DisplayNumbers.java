package org.sci;

import java.util.Scanner;

public class DisplayNumbers {

    protected static void display(){
        System.out.println("5. Display all the prime numbers lower than a given number");

        System.out.println("Input a number(integer)");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        System.out.println("The prime numbers from 0 to " + userInput + " are: ");
        for ( int i = 0; i <= userInput ; i++ ){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

}

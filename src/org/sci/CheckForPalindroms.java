package org.sci;

import java.util.Scanner;

public class CheckForPalindroms {

    protected static void display(){
        System.out.println("4. Check if a number is palindrom( e.g palindrom 1221, 34143)");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a palndrome: ");

        int num = scanner.nextInt();

        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 ) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palindrome.");
        }
        else {
            System.out.println(originalInteger + " is not a palindrome.");
        }

        System.out.println("----------------------------------------------");
    }

}


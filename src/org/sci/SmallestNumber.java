package org.sci;

public class SmallestNumber {

    protected static void display(){
        int[] numbersArray = {100,342,4,34,232};
        int min = numbersArray[0];

        for (int i = 0; i < numbersArray.length; i++){
            if(min>numbersArray[i]){
                min = numbersArray[i];
            }
        }
        System.out.println("2.The minimum number is: " + min);

        System.out.println("----------------------------------------------");

    }

}

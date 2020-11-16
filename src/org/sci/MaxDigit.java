package org.sci;

public class MaxDigit {

    public void display(){
        int number = 635;
        int reminder ,max = 0;
        while(number > 0){

            reminder = number % 10;
            if(max < reminder){
                max = reminder;
            }

            number = number / 10;
        }
        System.out.println("3.The largest digit is " + max);

        System.out.println("----------------------------------------------");
    }

}

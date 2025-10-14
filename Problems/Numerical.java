package com.krishna.Problems;

public class Numerical {
    public static void main(String[] args) {

        //Count digits of a number
        int number = 2393;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);


        //Factorial of a number
        int number1 = 6;
        int fact = 1;
        while (number > 0) {
            fact = fact * number1;
            number1--;
        }
        System.out.println("factorial is: " + fact);


    /*    1
        10
        100
        1000
        10000
        100000*/

        for (int i = 1; i <= 100000; i *= 10){
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1, j = 1; j <= 6; j++, i *= 10) {
            System.out.println(i);
        }
    }
}

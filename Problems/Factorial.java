package com.krishna.Problems;

public class Factorial {
    public static void main(String[] args){
        System.out.println(getFactorial(7));
        System.out.println(getFactorial2(7));
        System.out.println(getFactorial3(7));


    }
    /*First approach (Iterating in descending order)
    (fact = num* fact)
    7 = 7x1, 42 = 6x7, 210 = 5x42, 840 = 4x210, 2520 = 3x840, 5040 = 2x2520, 5040 = 1x5040
     */
    public static int getFactorial(int num){
        int fact = 1;
        while(num > 0){
            fact = num * fact;
            num--;
        }
        return fact;
    }

    /*Second approach (Iterating in ascending order)
    (fact = fact*i)
    1 = 1x1, 2 = 1x2, 6 = 2x3, 24=6x4,  120=24x5, 720=120x6, 5040= 720x7
    */
    public static int getFactorial2(int num){
        int fact = 1;
        for(int i =1; i <=num; i++){
            fact = fact *i;
            System.out.println(fact);
        }
        return fact;
    }

    /*Recursion approach*/
    public static int getFactorial3(int num){
        if (num == 1){
            return 1;
        }
        return num * getFactorial3(num-1);
    }
}

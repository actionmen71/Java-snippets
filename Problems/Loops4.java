package com.krishna.Problems;

//Q Sum of array

public class Loops4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = -6;
        arr[3] = 80;
        arr[4] = 12;
        int sum = 0;
        int sum1 = 0;

        for(int i = arr.length -1; i>=0; i--){
            sum += arr[i];
        }
        System.out.println(sum);

        for (int i: arr){
            sum1 += i;
        }
        System.out.println(sum1);
    }
}

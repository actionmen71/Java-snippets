package com.krishna.Problems;

//Q Find the largest element from the array

public class Loops {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 222;
        arr[1] = 4;
        arr[2] = -53;
        arr[3] = 99;
        arr[4] = 123;
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > res){
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}

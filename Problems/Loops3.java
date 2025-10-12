package com.krishna.Problems;

//Q Print the reverse of an array
public class Loops3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 222;
        arr[1] = 4;
        arr[2] = -53;
        arr[3] = 99;
        arr[4] = 123;

        for(int i = arr.length -1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}

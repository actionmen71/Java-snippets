package com.krishna.Problems;

//Q Find whether the search element exists in the array and if yes then find its index.

public class Loops2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 222;
        arr[1] = 4;
        arr[2] = -53;
        arr[3] = 99;
        arr[4] = 123;

        int search = 123;
        int c = -1;

        //using index loop approach
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.println("Found at index.."+i);
            }
        }
        //using for each loop
        for (int i:arr){
            c +=1;
            if(i == search){
                System.out.println("Found at index.."+c);
            }
        }
    }
}

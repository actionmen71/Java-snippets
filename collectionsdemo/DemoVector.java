package com.krishna.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
//    ArrayList<Integer> list = new ArrayList<>();
    Vector<Integer> list = new Vector<>();

    Thread t1 = new Thread(()->{
        for (int i =0;i<1000;i++){
            list.add(i);
        }
    });

    Thread t2 = new Thread(()->{
        for (int i =0;i<1000;i++){
            list.add(i);
        }
    });


    try {
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    catch (InterruptedException ie){
        ie.printStackTrace();
    }

    System.out.println("Size of Vector: "+list.size());
}}



//OP           Size of ArrayList: 1732
//OP           Size of Vector: 2000
// Vector - Synchronized
//ArrayList - non-Synchronized
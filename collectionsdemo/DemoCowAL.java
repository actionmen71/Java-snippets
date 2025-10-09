package com.krishna.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class DemoCowAL {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String > list1 = new CopyOnWriteArrayList<>();
        list1.add("Milk");
        list1.add("Eggs");
        list1.add("Bread");
        System.out.println("Initial Shopping list: "+ list1);

        for (String s : list1) {
            System.out.println(s);
            if(s.equals("Eggs")){
                list1.add("Butter");
                System.out.println("Added Butter while reading!");
            }
        }
        System.out.println("Updated shopping list: "+list1);



//        ArrayList<String > list1 = new ArrayList<>();
//        list1.add("Milk");
//        list1.add("Eggs");
//        list1.add("Bread");
//        System.out.println("Initial Shopping list: "+ list1);
//
//        for (String s : list1) {
//            System.out.println(s);
//            if(s.equals("Eggs")){
//                list1.add("Butter");
//                System.out.println("Added Butter while reading!");
//            }
//        }
//        System.out.println("Updated shopping list: "+list1);

    }
}

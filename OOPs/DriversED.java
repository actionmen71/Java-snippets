package com.krishna.OOPs;

import java.util.concurrent.atomic.AtomicInteger;

public class DriversED {

    //    static private int count; //not thread safe
        private static AtomicInteger count = new AtomicInteger(0);
        String name;
        int age;

        DriversED(String name, int age){
            if (age >= 16){
                this.name = name;
                this.age = age;
                System.out.println("Admission Successfully! "+name);
                count.incrementAndGet();
            }
            else {
                System.out.println("Not Eligible! Your age must be 16 or above..." + name);
            }

        }
        public static AtomicInteger getTotalAdmissions(){
            return count;
        }

        public static void main(String[] args) {
            System.out.println(DriversED.getTotalAdmissions());
            DriversED p1 = new DriversED("Sam", 21);
            DriversED p2 = new DriversED("Max", 19);
            DriversED p3 = new DriversED("Jenny", 11);
            DriversED p4 = new DriversED("Poly", 16);
            DriversED p5 = new DriversED("Troy", 15);
            DriversED p6 = new DriversED("Danny", 25);
            System.out.println(DriversED.getTotalAdmissions());

        }

}

/*
Even if the age is ineligible, an object is still created in memory before the constructor runs.
So the ineligible objects will initialize with default values.
If we don't want to create any object at all, then we have to use factory method.
 */
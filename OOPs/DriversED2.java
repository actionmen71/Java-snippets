package com.krishna.OOPs;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DriversED2 {
    private static AtomicInteger count = new AtomicInteger(0);
    private String name;
    private int age;

    private DriversED2(String name, int age){
        this.name = name;
        this.age = age;
    };

    public static DriversED2 getAdmission(String name, int age){
        if(age >= 16){
            count.incrementAndGet();
            System.out.println("Admission successfully.."+name);
            return new DriversED2(name,age);
        }
        else {
            System.out.println("Not Eligible! Your age must be 16 or above..." + name);
            return null;
        }
    }
    public static AtomicInteger getTotalAdmissions(){
        return count;
    }

    public static void main(String[] args) {
        System.out.println(DriversED2.getTotalAdmissions());
        DriversED2.getAdmission("Sam", 21);
        DriversED2.getAdmission("Max", 12);
        DriversED2.getAdmission("Peter", 24);
        DriversED2.getAdmission("Mark", 16);
        DriversED2.getAdmission("Akon", 15);
        DriversED2.getAdmission("Krishna", 29);
        System.out.println(DriversED2.getTotalAdmissions());

    }

}

package com.krishna.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;}


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.4));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 3.6));
        students.add(new Student("Sam", 3.7));

//        students.sort(null);
//Here sort(null) will not work, no natural sorting for the Student class, not implementing comparable

    }
}


package com.krishna.collectionsdemo;

import java.util.*;

public class DemoComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sam", "Peter", "Wednesday","Ai");

        //natural sorting order
        list.sort(null);
        System.out.println(list);
        list.sort(new StringLengthComparator());
        System.out.println(list);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
       return o1.length() - o2.length();
    }
}

package com.krishna.collectionsdemo;

import java.util.*;

public class DemoComparator {
    public static void main(String[] args) {
        //created String Arraylist
        List<String> list = Arrays.asList("Sam", "Peter", "Wednesday","Ai","Bennedict");

        //Natural sorting order (ascending default)
        list.sort(null);
        System.out.println(list);

        //Custom sorting order via implementing Comparator interface (ascending condition string length)
        list.sort(new StringLengthComparator());
        System.out.println(list);

        //Custom sorting order via using Lambda expression (descending condition string length)
        list.sort((a,b) ->b.length()-a.length());
        System.out.println(list);

        //Custom sorting order via using Lambda expression (ascending)
        Comparator<String> descComparator = (s1,s2)->s2.compareTo(s1);
        list.sort(descComparator);
        System.out.println(list);

    }
}

//Implementing Comparator interface for custom sorting order
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
       return o1.length() - o2.length();
    }
}

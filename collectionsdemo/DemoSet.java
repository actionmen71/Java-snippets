package com.krishna.collectionsdemo;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class DemoSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(67);
        set.add(3);
        set.add(1);
        set.add(0);
        System.out.println(set);  //mypackage.OP [1, 3] unordered
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(67);
        set2.add(3);
        set2.add(1);
        set2.add(0);
        System.out.println(set2); //mypackage.OP [1, 67, 3, 0] ordered
        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(67);
        set3.add(3);
        set3.add(1);
        set3.add(0);
        System.out.println(set3); //mypackage.OP [0, 1, 3, 67]  natural sorting order
        NavigableSet<Integer> set4 = new TreeSet<>();
        set4.add(1);
        set4.add(67);
        set4.add(3);
        set4.add(1);
        set4.add(0);
        System.out.println(set4);  //mypackage.OP [0, 1, 3, 67]  natural sorting order

        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println();
        for (Integer i : set2) {
            System.out.println(i);
        }
        System.out.println();
        for (Integer i : set3) {
            System.out.println(i);
        }
        System.out.println();
        for (Integer i : set4) {
            System.out.println(i);
        }

        //synchronized version, not recommend to use
        Set<Integer> set1 = Collections.synchronizedSet(set);

        //concurrent version, recommended
        ConcurrentSkipListSet<Integer> set5 = new ConcurrentSkipListSet<>();

        //unmodifiable
        Set<Integer> set6 = Set.of(1, 2, 3,4,5,6,7,8,9,11);
        System.out.println(set6);


    }
    }


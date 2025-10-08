package com.krishna.collectionsdemo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class DemoLL {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        linkedList.addFirst(69);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.removeIf(x -> x%2 ==0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Buffalo"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat","Dog"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);


    }
}



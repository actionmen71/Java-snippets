package com.krishna.collectionsdemo;

import java.util.Stack;
import java.util.WeakHashMap;

//Although it is a tack but since it is child of vector
//we can add in the middle
//we can  remove from the middle
public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.add(3,69);
        System.out.println(stack);

        stack.remove(4);
        System.out.println(stack);


        int search = stack.search(70);
        System.out.println(search);
        int search1 = stack.search(69);
        System.out.println(search1);

        stack.addFirst(90);
        System.out.println(stack);


    }
}

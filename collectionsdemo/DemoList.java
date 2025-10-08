package com.krishna.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(23);
        System.out.println();
        list.remove(2);
//        for (int x:list){
//            System.out.println(x);
//        }
        System.out.println();
        System.out.println(list.contains(38));
        System.out.println(list.contains(2));
        System.out.println(list);
        String[] week = {"Monday","Tuesday","Thursday","Friday"};
        System.out.println(week);
        for(String x: week){
            System.out.println(x);
        }
        List<String >list2 =Arrays.asList(week);
        System.out.println(list2);

        List<Integer> list1 = List.of(1, 2, 3);
        System.out.println(list1);



    }

}

package com.krishna.collectionsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap<>();
        map.put(1,"Akshay");
        map.put(2,"Neha");
        map.put(3,"Shubham");
        map.put(69,"Bablu");
        System.out.println(map);

        String person = map.get(3);
        System.out.println(person);

//        String s = map.get(409);
//        System.out.println(s);
        //mypackage.OP    null

        System.out.println("contains key 2: "+map.containsKey(2));

        System.out.println("contains value Prakash: "+map.containsValue("Prakash"));
        System.out.println("contains value Shubham: "+map.containsValue("Shubham"));

        System.out.println();
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }

        //key has been already used, replace, not add
        map.put(2,"Mahi");
        map.remove(69);
        boolean res = map.remove(69, "Bablu");
        System.out.println(res); //mypackage.OP false, doesn't exist

        System.out.println();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey()+"..."+entry.getValue());
        }


    }
}

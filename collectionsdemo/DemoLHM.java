package com.krishna.collectionsdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLHM {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Apple",30);
        linkedHashMap.put("Guava",40);

        System.out.println("order maintained in LHM");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey()+"..."+entry.getValue());
        }


        HashMap<String ,Integer> hashMap = new HashMap<>();
        hashMap.put("Orange",10);
        hashMap.put("Apple",30);
        hashMap.put("Guava",40);
        System.out.println();
        System.out.println("order not maintained in HM");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+"..."+entry.getValue());
        }
        //mypackage.OP            order not maintained in hashmap
//        Guava...40
//        Apple...30
//        Orange...10

        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(10,0.8f,true);
        linkedHashMap1.put("Orange",10);
        linkedHashMap1.put("Apple",30);
        linkedHashMap1.put("Guava",40);
        linkedHashMap1.get("Apple");
        linkedHashMap1.get("Orange");
        System.out.println();
        System.out.println("Playing with access order LHM");
        for (Map.Entry<String, Integer> entry : linkedHashMap1.entrySet()) {
            System.out.println(entry.getKey()+"..."+entry.getValue());
        }
    }
}

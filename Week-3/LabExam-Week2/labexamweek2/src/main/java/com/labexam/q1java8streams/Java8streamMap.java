package com.labexam.q1java8streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Java8streamMap {
    public static void main(String[] args) {
        //printing the map

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("raj", 95);
        map.put("ekta", 75);
        map.put("rajiv", 85);
        map.put("sunita", 66);
        map.put("gunika", 99);
        System.out.println("------printing map------");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //print the map using java 8 streams

        System.out.println("------printing map using java 8 streams------");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        //print only that records that contain key contains raj

        System.out.println("------printing only that records that contain key contains raj------");
        map.entrySet().stream().filter(e -> e.getKey().contains("raj")).forEach(System.out::println);

        //print map sorted by key

        System.out.println("------printing map sorted by key------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //print map sorted by value

        System.out.println("------printing map sorted by value------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        //print map reverse sorted by the key

        System.out.println("------printing map reverse sorted by the key------");
 //       map.entrySet().stream().sorted((Comparator<? super Map.Entry<String, Integer>>) Map.Entry.comparingByKey().reversed()).forEach(System.out::println);

        //consider key as user define key:

        System.out.println("------consider key as user define key------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        })).forEach(System.out::println);
    }
}

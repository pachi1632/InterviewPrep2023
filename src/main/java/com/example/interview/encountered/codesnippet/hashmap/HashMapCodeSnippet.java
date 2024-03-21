package com.example.interview.encountered.codesnippet.hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapCodeSnippet {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap();
        hashMap.put(1, 2);
        hashMap.put(2, 4);
        hashMap.put(1, 3);
        hashMap.put(5, 6);
        hashMap.put(null, 6);
        hashMap.put(null, 7);
        System.out.println(hashMap.get(null));


        List<Integer> list = new LinkedList<>();
        list.size();

    }
}

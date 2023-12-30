package com.example.interview.prep.basicprograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {


    public static void main(String[] args) {

        HashMap<String, Integer> unsortedMap = new HashMap<>();
        HashMap<String, Integer> sortedMap = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue, (e1, e2) -> e1, LinkedHashMap :: new));


    }

}

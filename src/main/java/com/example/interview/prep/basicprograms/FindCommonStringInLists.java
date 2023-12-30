package com.example.interview.prep.basicprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonStringInLists {



    public static void main(String[] args) throws IOException {

        List<String> l1= Arrays.asList("interview");

        List<String> l2= Arrays.asList("interview","prashanth");

        List<String> l3 = new ArrayList<>();

        l3 = l1.stream().filter(l1Item -> l2.contains(l1Item)).collect(Collectors.toList());
    }

}

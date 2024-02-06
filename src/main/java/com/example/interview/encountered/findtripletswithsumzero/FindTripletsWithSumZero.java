package com.example.interview.encountered.findtripletswithsumzero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTripletsWithSumZero {
    public static void main(String[] args) {
        /*int[] intArray = {1, -1, 2, -2, 0};*/
        int[] intArray = { 0, -1, 2, -3, 1 };
        findTriplets(intArray);
    }

    public static void findTriplets(int[] intArray){
        Arrays.sort(intArray);
        for(int i=0; i< intArray.length - 2; i++){
            int left = i+1, right = intArray.length-1;
            Set<Integer> triplets = new HashSet<>();
            while(left < right){
                int sum = intArray[i] + intArray[left] + intArray[right];
                if(sum == 0 && !triplets.contains(intArray[i])){
                    System.out.println(intArray[i]+" "+intArray[left]+" "+ intArray[right]);
                    triplets.add(intArray[i]);
                } else if(sum < 0){
                    left++;
                } else{
                    right--;
                }
            }
        }
    }
}

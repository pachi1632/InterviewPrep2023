package com.example.interview.encountered.findtripletswithsumzero.gfg;
/*
Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.

Url: https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/

Examples :

Input: arr[] = {0, -1, 2, -3, 1}
Output: (0 -1 1), (2 -3 1)
Explanation: The triplets with zero sum are 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0

Input: arr[] = {1, -2, 1, 0, 5}
Output: 1 -2  1
Explanation: The triplets with zero sum is 1 + -2 + 1 = 0


* */
// Java program to find triplets in a given
// array whose sum is zero

import java.util.HashSet;

class FindTripletsWithSumZeroGFG {

    // function to print triplets with 0 sum
    static void findTriplets(int arr[], int n)
    {
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            // Find all pairs with sum equals to
            // "-arr[i]"
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = i + 1; j < n; j++) {
                int x = -(arr[i] + arr[j]);
                if (s.contains(x)) {
                    System.out.printf("%d %d %d\n", x,
                            arr[i], arr[j]);
                    found = true;
                }
                else {
                    s.add(arr[j]);
                }
            }
        }

        if (found == false) {
            System.out.printf(" No Triplet Found\n");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        findTriplets(arr, n);
    }
}

// This code contributed by Rajput-Ji

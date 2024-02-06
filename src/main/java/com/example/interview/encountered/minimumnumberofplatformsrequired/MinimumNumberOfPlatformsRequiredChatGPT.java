package com.example.interview.encountered.minimumnumberofplatformsrequired;

import java.util.Arrays;

/*
Q: Given arrival and departure times of all trains that reach a railway station.
Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Example 1:

Input: n = 6
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}

Output: 3

Explanation:
Minimum 3 platforms are required to safely arrive and depart all trains.
* */
public class MinimumNumberOfPlatformsRequiredChatGPT {
    // Function to find the minimum number of platforms required
    public static int findPlatform(int[] arr, int[] dep, int n) {
        // Sort arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat_needed = 1; // Initial platform needed
        int result = 1;
        int i = 1, j = 0;

        // Iterate through trains
        while (i < n && j < n) {
            // If next event is an arrival, increment count of platforms needed
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }
            // Else decrement count of platforms needed
            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
            // Update result if needed
            if (plat_needed > result) {
                result = plat_needed;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;

        System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
    }

}

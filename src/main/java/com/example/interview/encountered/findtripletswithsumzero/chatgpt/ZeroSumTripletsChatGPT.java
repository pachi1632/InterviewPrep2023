package com.example.interview.encountered.findtripletswithsumzero.chatgpt;
/*

Q: Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.

Finding triplets in an array whose sum is zero can be efficiently solved using a mix of sorting and two-pointer technique. Here's a step-by-step approach:

1. **Sort** the array. This allows us to move through the array with two pointers effectively.
2. **Iterate** through the array, taking each element as a potential starting point for a triplet.
3. For each element, **use two pointers** to find pairs that together with the current element sum to zero. One pointer starts just after the current element, and the other starts from the end of the array. Move these pointers appropriately based on their sum.
4. **Avoid duplicate triplets** by skipping over duplicate values for both the current element and the two pointers.

Here's how you can implement it in Java:

```java

```

This program defines a `findTriplets` method that takes an array of integers as input and returns a list of lists, where each inner list represents a triplet whose sum is zero. The main steps include sorting the array, iterating through it while applying the two-pointer technique to find matching pairs, and handling duplicates to ensure unique triplets are found.
* */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroSumTripletsChatGPT {
    public static List<List<Integer>> findTriplets(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) { // Step 2: Iterate through the array
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates

            int left = i + 1, right = nums.length - 1;
            while (left < right) { // Step 3: Two-pointer technique
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates
                    while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets; // Return the list of triplets
    }

    public static void main(String[] args) {
        /*int[] nums = {-1, 0, 1, 2, -1, -4};*/
        int[] nums = { 0, -1, 2, -3, 1 };
        List<List<Integer>> triplets = findTriplets(nums);
        System.out.println("Triplets with zero sum are: " + triplets);
    }
}

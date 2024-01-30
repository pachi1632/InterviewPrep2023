package com.example.interview.prep.dsa;
/*
To create a Java program that finds all pairs of integers in an array that add up to a given sum, you can use a HashSet to store elements and check if the complement of each element (i.e., `sum - element`) exists in the set. Here's a step-by-step approach:

1. **Input**: Have an array of integers and a target sum as input.
2. **HashSet for Tracking**: Use a HashSet to keep track of the elements we've seen so far.
3. **Iterate and Find Pairs**: Iterate through the array, for each element, check if the set contains the complement (i.e., `sum - currentElement`). If it does, you've found a pair. Add the pair to the result list or print it out.
4. **Avoid Duplicates**: Add each element to the HashSet after checking for its complement to avoid counting duplicates.

In this program, the `findPairsWithSum` method goes through each element in the array, computes its complement for the given sum, and checks if this complement is already in the HashSet. If it is, a pair that adds up to the sum has been found. Each element is then added to the HashSet to help find future pairs.

This implementation assumes the array can contain duplicate elements and treats them as separate entities. For example, in an array `[2, 2, 3, 5]` with a sum of `7`, it will report two pairs: `(2, 5)` and `(2, 5)`. If you want to handle duplicates differently, the logic would need to be adjusted accordingly.
*/
import java.util.HashSet;
import java.util.Set;

public class FindingPairsInAnArrayThatSumToASpecificValue {

    public static void findPairsWithSum(int[] array, int sum) {
        // HashSet to store array elements
        Set<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int number : array) {
            int complement = sum - number;

            // Check if the complement exists in the set
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + number + ")");
            }

            // Add the current number to the set
            seen.add(number);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 6, 7, 9, 1};
        int sum = 10;

        // Find and print all pairs with the given sum
        findPairsWithSum(array, sum);
    }
}

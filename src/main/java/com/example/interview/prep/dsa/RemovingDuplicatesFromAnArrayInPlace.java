package com.example.interview.prep.dsa;

/*
Removing duplicates from an array in Java without using extra space can be challenging, especially if you want to maintain the order of elements. A common approach is to sort the array first and then remove duplicates, but this changes the order. If maintaining the original order is not a requirement, this method can be effective.

Here's how you can implement it:

1. **Sort the Array**: First, sort the array. This will bring all duplicates next to each other.
2. **In-Place Removal**: Iterate through the sorted array and shift non-duplicate elements to the front.

In this program, after sorting the array, we use two pointers. The `j` pointer is used to keep track of the position of the next unique element in the array, while `i` iterates through the array. Whenever a unique element is found, it's moved to the position indicated by `j`, and `j` is incremented.

Note that this method changes the original order of elements. If maintaining order is crucial, then removing duplicates without extra space is more complex and may require a specific data structure or constraints on the input.
*/

import java.util.Arrays;

public class RemovingDuplicatesFromAnArrayInPlace {

    public static int removeDuplicates(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array.length;
        }

        // Sort the array
        Arrays.sort(array);

        // Two pointers approach
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }

        // Add the last element
        array[j++] = array[array.length - 1];

        return j; // New length of the array without duplicates
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 2, 3, 3, 4, 4};

        int newLength = removeDuplicates(array);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

package com.example.interview.prep.dsa;

/*
To create a Java program that finds duplicate numbers in an array using a dictionary or hash map, you need to iterate through the array and store the count of each number in the hash map. If a number appears more than once, it's a duplicate.

Here's a step-by-step guide to implement this:

1. **Input**: You'll need an array of integers as input.
2. **Hash Map**: Use a `HashMap` to store the frequency of each number.
3. **Iteration**: Iterate over the array, updating the hash map with the count of each number.
4. **Check for Duplicates**: While iterating, if you find a number already in the hash map, it's a duplicate.
5. **Output**: Print or store the duplicate numbers.

In this program, the `findDuplicates` method does the main work. It uses a `HashMap` to store the count of each number. As it iterates through the array, it checks if the number is already in the map. If it is, that means the number is a duplicate and is printed out. The `main` method provides a sample array to test this functionality.
*/
import java.util.HashMap;
import java.util.Map;

public class FindingDuplicatesInAnArray {

    public static void findDuplicates(int[] array) {
        // Creating a hash map to store numbers and their count
        Map<Integer, Integer> numberCount = new HashMap<>();

        // Iterate through the array
        for (int number : array) {
            if (numberCount.containsKey(number)) {
                // If the number is already in the map, it's a duplicate
                System.out.println("Duplicate found: " + number);
            } else {
                // Put the number in the map with count 1
                numberCount.put(number, 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 5};

        // Find duplicates in the array
        findDuplicates(array);
    }
}


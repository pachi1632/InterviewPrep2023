package com.example.interview.prep.dsa;

/*
Writing a Java program to find the largest and smallest numbers in an array is a common exercise. The basic idea is to iterate through the array, keeping track of the smallest and largest values found so far. Here's a step-by-step approach:

1. **Input**: Start with an array of integers.
2. **Initialization**: Initialize two variables, one for the smallest number and one for the largest. You can initialize them with the first element of the array or with maximum and minimum values.
3. **Iteration**: Loop through the array, updating the smallest and largest values as you go.
4. **Result**: After the loop, you will have the smallest and largest numbers in the array.

In this program, the `findMinMax` method iterates through the array and updates the `min` and `max` variables whenever it finds a smaller or larger number, respectively. The `main` method demonstrates this functionality with a sample array. Remember, if the array is empty, the method will print a message indicating so.
*/

public class FindingTheLargestAndSmallestNumbersInAnArray {

    public static void findMinMax(int[] array) {
        // Handling the case when the array is empty
        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize min and max with the first element of the array
        int min = array[0];
        int max = array[0];

        // Iterate through the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                // Update max if current element is greater
                max = array[i];
            } else if (array[i] < min) {
                // Update min if current element is smaller
                min = array[i];
            }
        }

        // Print the results
        System.out.println("Smallest Number: " + min);
        System.out.println("Largest Number: " + max);
    }

    public static void main(String[] args) {
        int[] array = {34, 19, 11, 89, 45, 77, 21};

        // Find the smallest and largest numbers in the array
        findMinMax(array);
    }
}


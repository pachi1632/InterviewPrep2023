package com.example.interview.prep.dsa;

/*
11.	**Finding the Single Element in an Array**: Developing a code to find the element that appears only once in an array where every other element appears twice.

To find the element that appears only once in an array where every other element appears twice, you can use the XOR operation. This is a very efficient solution, as the XOR of two same numbers is 0, and the XOR of any number with 0 is the number itself. When you XOR all the elements of the array, the elements that appear twice will cancel each other out, and you'll be left with the element that appears only once.

Here's how you can implement it in Java:

1. **Initialize a Variable**: Start with a variable initialized to 0.
2. **Iterate and XOR**: Iterate through the array, applying the XOR operation to each element with the initialized variable.
3. **Result**: The value of the variable after the loop will be the element that appears only once.

In this program:
- The `findSingle` method iterates through the array and performs an XOR operation on each element with the `result` variable.
- Initially, `result` is 0, so after the first XOR operation, `result` becomes the first element.
- As the loop continues, pairs of identical elements will cancel each other out, leaving `result` with the value of the single element.
- The `main` method demonstrates how to use the `findSingle` method with a sample array.

This approach assumes that there is exactly one element that appears once and all other elements appear twice. The program will correctly identify the single element in the given array. In the example provided, the output will be the number `4`, which is the only number in the array that doesn't have a duplicate.
*/

public class FindingTheSingleElementInAnArray {

    // Method to find the single element
    public static int findSingle(int[] array) {
        int result = 0;

        for (int number : array) {
            result ^= number;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 2, 3};
        System.out.println("The element that appears only once is: " + findSingle(array));
    }
}

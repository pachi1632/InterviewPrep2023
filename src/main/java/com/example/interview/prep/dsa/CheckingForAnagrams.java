package com.example.interview.prep.dsa;

/*
Writing a program to check if two strings are anagrams of each other by sorting and comparing them.

Creating a Java program to check if two strings are anagrams by sorting and comparing them
is a straightforward task.

An anagram is a word or phrase formed by rearranging the letters of
a different word or phrase, typically using all the original letters exactly once.

Here's a step-by-step guide to writing such a program:

1. **Input**: You'll need to get two strings as input.
2. **Validation**: Optionally, you can add a validation step to ensure the strings are of the same length.
3. **Sorting**: Sort the characters of both strings.
4. **Comparison**: Compare the sorted strings to check if they are equal.
5. **Output**: If they are equal, the strings are anagrams; otherwise, they are not.

In this program, the `areAnagrams` method does the core work. It first checks if the lengths of the two strings are the same. Then, it sorts the characters of both strings and finally compares the sorted arrays. The `main` method is just for demonstration purposes, where you can test the functionality with different strings.
*/

import java.util.Arrays;

public class CheckingForAnagrams {

    // Method to check if two strings are anagram
    public static boolean areAnagrams(String str1, String str2) {
        // Optional: Check if lengths are same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Check if sorted arrays are equal
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Check if str1 and str2 are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}


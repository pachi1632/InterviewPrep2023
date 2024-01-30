package com.example.interview.prep.dsa;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralToIntegerConversion {
    // Method to convert Roman numeral to integer
    public static int romanToInt(String s) {
        // Map to store Roman numerals and their integer values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Get value of current numeral
            int value = romanValues.get(s.charAt(i));

            // Check if next numeral is larger
            if (i < n - 1 && value < romanValues.get(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV"; // 1994
        System.out.println("Integer form of Roman numeral " + roman + " is " + romanToInt(roman));
    }
}

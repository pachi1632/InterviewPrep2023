package com.example.interview.prep.basicprograms.encountered.largestnumberlessthannmaximumsum;

// Java implementation of the approach

/*
Url: https://www.geeksforgeeks.org/largest-number-less-than-n-with-digit-sum-greater-than-the-digit-sum-of-n/
* */

class LargestNumberLessThanNMaximumSum {
    // Function to return the greatest
    // number less than n such that
    // the sum of its digits is greater
    // than the sum of the digits of n
    static int findNumber(String number)
    {

        Integer n = Integer.valueOf(number);

        int sum_n = 0;
        int temp_n = n;

        /*Method 1 to find sum of digits in integer*/
        /*while (temp_n > 0) {
            sum_n += temp_n % 10;
            temp_n /= 10;
        }*/

        /*Method 2 to find sum of digits in integer*/
        /*String.valueOf(temp_n)
                .chars()
                .map(Character::getNumericValue)
                .sum();*/

        /*Method 3 to find sum of digits in integer*/
        sum_n = number.chars()
                .map(Character::getNumericValue)
                .sum();

        for (int i = n - 1; i > 0; i--) {
            int sum_i = 0;
            int temp_i = i;
            /*Method 1 to find sum of digits in integer*/
            /*while (temp_i > 0) {
                sum_i += temp_i % 10;
                temp_i /= 10;
            }*/
            /*Method 2 to find sum of digits in integer*/
            sum_i = String.valueOf(temp_i).chars().map(Character :: getNumericValue).sum();

            if (sum_i > sum_n) {
                return i;
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        String n = "988";
        System.out.println(findNumber(n));
    }
}

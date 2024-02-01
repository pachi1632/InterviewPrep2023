package com.example.interview.prep.basicprograms.encountered.largestnumberlessthannmaximumsum.gfg;

// Java implementation of the approach

class LargestNumberLessThanNMaximumSum {
    // Function to return the greatest
    // number less than n such that
    // the sum of its digits is greater
    // than the sum of the digits of n
    static int findNumber(int n)
    {
        for (int i = n - 1; i > 0; i--) {
            int sum_i = 0, sum_n = 0;
            int temp_i = i, temp_n = n;
            while (temp_i > 0) {
                sum_i += temp_i % 10;
                temp_i /= 10;
            }
            while (temp_n > 0) {
                sum_n += temp_n % 10;
                temp_n /= 10;
            }
            if (sum_i > sum_n) {
                return i;
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 824;
        System.out.println(findNumber(n));
    }
}


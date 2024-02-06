package com.example.interview.encountered.largestnumberlessthannmaximumsum.gfg;
/*
Biggest integer which has maximum digit sum in range from 1 to n
Url: https://www.geeksforgeeks.org/biggest-integer-maximum-digit-sum-range-1-n/
Not the one asked in interview but use for reference: https://www.geeksforgeeks.org/largest-number-less-than-n-with-digit-sum-greater-than-the-digit-sum-of-n/
* */
// Java implementation of the approach

class LargestNumberLessThanNMaximumSum {

    /*Method 1 Not the one asked in interview but keep for reference*/
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

    /*Method 2 asked in interview*/
    // function to calculate the
    // sum of digits of a number.
    static int sumOfDigits(int a)
    {
        int sum = 0;
        while (a!=0)
        {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    // Returns the maximum number
    // with maximum sum of digits.
    static int findMax(int x)
    {
        // initializing b as 1 and
        // initial max sum to be of n
        int b = 1, ans = x;

        // iterates from right to
        // left in a digit
        while (x!=0)
        {

            // while iterating this
            // is the number from
            // from right to left
            int cur = (x - 1) * b + (b - 1);

            // calls the function to
            // check if sum of cur is
            // more then of ans
            if (sumOfDigits(cur) > sumOfDigits(ans) ||
                    (sumOfDigits(cur) == sumOfDigits(ans) &&
                            cur > ans))
                ans = cur;

            // reduces the number to one unit less
            x /= 10;
            b *= 10;
        }

        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 824;
        /*Keep for future reference*/
        System.out.println(findNumber(n));
        /*Asked in interview*/
        System.out.println(findMax(n));
    }
}


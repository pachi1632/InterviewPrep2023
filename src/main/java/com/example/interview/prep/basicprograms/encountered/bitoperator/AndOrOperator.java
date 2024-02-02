package com.example.interview.prep.basicprograms.encountered.bitoperator;

/*

Q: What is the output of following
        * 3&5
        * 3|5
Answer:
        * 1
        * 7

In Java (and in many programming languages), the `&` operator performs a bitwise AND operation, and the `|` operator performs a bitwise OR operation on two integers. Here's what happens when you use these operators with the values `3` and `5`:

1. `3 & 5`:
   - Binary representation of `3` is `0011`.
   - Binary representation of `5` is `0101`.
   - When you perform a bitwise AND operation (`&`) between these binary representations, it returns a new integer where each bit is the result of ANDing the corresponding bits from both numbers.
   - `0011 & 0101` results in `0001`, which is `1` in decimal.

So, the result of `3 & 5` is `1`.

2. `3 | 5`:
   - Binary representation of `3` is `0011`.
   - Binary representation of `5` is `0101`.
   - When you perform a bitwise OR operation (`|`) between these binary representations, it returns a new integer where each bit is the result of ORing the corresponding bits from both numbers.
   - `0011 | 0101` results in `0111`, which is `7` in decimal.

So, the result of `3 | 5` is `7`.

In Java 8, if you were to print the results:

The program would output:

```
Result of 3 & 5: 1
Result of 3 | 5: 7
```
* */
public class AndOrOperator {
    public static void main(String[] args) {
        /*
        * Q: What is the output of following
        * 3&5
        * 3|5
        *
        * Answer:
        * 1
        * 7
        * */
        System.out.println(3&5);
        System.out.println(3|5);
    }
}

package com.example.interview.prep.dsa;

public class FindingTheRightmostDifferentBit {

    // Method to find the position of the rightmost differing bit
    public static int findRightmostDifferentBit(int num1, int num2) {
        // XOR the two numbers
        int xor = num1 ^ num2;

        // AND the XOR result with its two's complement
        int rightmostSetBit = xor & -xor;

        // Find the position of the rightmost set bit
        return (int)(Math.log(rightmostSetBit) / Math.log(2)) + 1;
    }

    public static void main(String[] args) {
        int num1 = 52;  // Binary representation: 110100
        int num2 = 4;   // Binary representation: 000100

        int position = findRightmostDifferentBit(num1, num2);
        System.out.println("Position of the rightmost differing bit: " + position);
    }
}


package com.example.interview.prep.finantialcalculations;
/*
CI = P( 1 + r/n)nt - P

* */
public class CompoundInterestCalculator {
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate / 100.0, time) - principal;
    }

    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0;
        double time = 2.0;

        double compoundInterest = calculateCompoundInterest(principal, rate, time);

        System.out.println("Compound Interest: $" + compoundInterest);
    }
}


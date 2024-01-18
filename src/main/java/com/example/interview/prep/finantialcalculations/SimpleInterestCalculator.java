package com.example.interview.prep.finantialcalculations;

/*
SimpleInterest = (principal * rate * time) / 100
* */
public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0;
        double time = 2.0;

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest: $" + simpleInterest);
    }
}


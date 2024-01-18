package com.example.interview.prep.finantialcalculations;

public class PresentValueCalculator {
    public static double calculatePresentValue(double futureValue, double discountRate, double time) {
        return futureValue / Math.pow(1 + discountRate / 100.0, time);
    }

    public static void main(String[] args) {
        double futureValue = 1100.0;
        double discountRate = 5.0;
        double time = 2.0;

        double presentValue = calculatePresentValue(futureValue, discountRate, time);

        System.out.println("Present Value: $" + presentValue);
    }
}


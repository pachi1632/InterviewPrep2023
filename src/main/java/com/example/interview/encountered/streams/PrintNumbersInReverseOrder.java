package com.example.interview.encountered.streams;

import java.util.stream.IntStream;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 12).map(i -> 13 - i).forEach(System.out:: println);
    }
}

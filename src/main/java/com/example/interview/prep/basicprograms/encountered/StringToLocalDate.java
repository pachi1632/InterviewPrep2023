package com.example.interview.prep.basicprograms.encountered;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {
    public static void main(String[] args) {
        /*String dateStr = "12-2003";
        // Append "-01" to represent the first day of the month
        String fullDateStr = dateStr + "-01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd");

        LocalDate date = LocalDate.parse(fullDateStr, formatter);
        System.out.println("LocalDate: " + date);*/

        String dateStr = "12-2003";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        LocalDate date = LocalDate.parse(dateStr + "-01", formatter);
        System.out.println(date);
    }
}



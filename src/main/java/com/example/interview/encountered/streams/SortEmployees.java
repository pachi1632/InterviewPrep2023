package com.example.interview.encountered.streams;

/*
Asked By: OpenText
* */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 50000),
                new Employee("Jane Doe", 50000),
                new Employee("Jim Beam", 40000),
                new Employee("Alice Wonderland", 50000)
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary)
                        .reversed()
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());

        sortedEmployees.forEach(System.out::println);

    }
}


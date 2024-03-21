package com.example.interview.encountered.streams;
/*
Asked By: OpenText
To remove duplicate `Employee` objects from a list using Java 8 streams, you need a way to define what makes an `Employee` object unique. This could be based on one attribute (like an ID) or a combination of attributes (like name and salary). Assuming `Employee` objects are considered duplicates if both their name and salary are the same, you can use the `distinct()` method provided by the Stream API only if `Employee` properly implements `equals()` and `hashCode()` methods based on these attributes.

Here's how to implement `equals()` and `hashCode()` in `Employee` and then remove duplicates:

### Step 1: Implement `equals()` and `hashCode()` in `Employee`

```java

```

### Step 2: Remove Duplicates Using Streams

```java

```

In this setup:
- The `equals()` method is overridden to compare `Employee` objects based on both name and salary.
- The `hashCode()` method is overridden to ensure that `Employee` objects considered equal have the same hash code, which is essential for the `distinct()` method to work correctly.
- The `distinct()` method in the stream pipeline uses these `equals()` and `hashCode()` implementations to filter out duplicate `Employee` objects.
- The `collect(Collectors.toList())` method collects the unique `Employee` objects into a new list.

This approach ensures that your list will only contain unique `Employee` objects based on the criteria defined in the `equals()` method.
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 50000),
                new Employee("Jane Doe", 60000),
                new Employee("John Doe", 50000), // Duplicate
                new Employee("Alice Wonderland", 50000)
        );

        List<Employee> uniqueEmployees = employees.stream()
                .distinct()
                .collect(Collectors.toList());

        uniqueEmployees.forEach(System.out::println);
    }
}
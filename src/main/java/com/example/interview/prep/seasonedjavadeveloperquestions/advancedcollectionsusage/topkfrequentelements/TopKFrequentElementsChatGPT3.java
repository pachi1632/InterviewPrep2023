package com.example.interview.prep.seasonedjavadeveloperquestions.advancedcollectionsusage.topkfrequentelements;
/*
Given a large dataset, write a program to efficiently find the top k frequent elements using java 8

You can efficiently find the top k frequent elements in a large dataset using Java 8 by leveraging the `Stream` API and the `Collectors` class. Here's a Java program to achieve this:

```java

```

In this program:

1. We first create a frequency map using Java 8 streams. The `groupingBy` collector groups elements by their values and `counting()` counts the occurrences of each element.

2. We create a priority queue (min heap) to keep track of the top k frequent elements. We use a custom comparator that compares entries based on their values (frequencies).

3. We add entries from the frequency map to the min heap while maintaining its size as k. If the size exceeds k, we remove the entry with the lowest frequency.

4. After processing all entries, we extract the top k frequent elements from the min heap and store them in the result list.

5. Finally, we reverse the list to get the elements in descending order of frequency, providing the top k frequent elements.

This program efficiently finds the top k frequent elements in a large dataset using Java 8 streams and a min heap for optimal time complexity.
* */

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElementsChatGPT3 {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Create a frequency map using Java 8 streams
        Map<Integer, Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Integer::intValue,
                        Collectors.counting()
                ));

        // Create a priority queue (min heap) based on frequency
        PriorityQueue<Map.Entry<Integer, Long>> minHeap =
                new PriorityQueue<>(Comparator.comparingLong(Map.Entry::getValue));

        // Add entries to the min heap, maintaining its size as k
        for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Extract the top k frequent elements from the min heap
        List<Integer> result = new ArrayList<>(k);
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Reverse the list to get elements in descending order of frequency
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> topKFrequentElements = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + topKFrequentElements);
    }
}

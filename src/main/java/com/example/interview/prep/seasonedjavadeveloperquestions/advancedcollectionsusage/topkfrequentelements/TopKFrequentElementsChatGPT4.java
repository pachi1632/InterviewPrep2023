package com.example.interview.prep.seasonedjavadeveloperquestions.advancedcollectionsusage.topkfrequentelements;

/*
To efficiently find the top \( k \) frequent elements in a large dataset in Java 8, you can use a combination of a HashMap to store the frequency of each element and a PriorityQueue (min heap) to keep track of the top \( k \) frequent elements. This approach ensures \( O(n \log k) \) time complexity, where \( n \) is the number of elements in the dataset.

Here's a Java 8 program to do this:

```java

```

In this program:

1. A `HashMap` (frequencyMap) is used to store the frequency of each element in the dataset.
2. A `PriorityQueue` (min heap) is used to keep track of the top \( k \) elements. The priority queue is ordered by the frequency of elements.
3. We iterate through the frequency map, adding elements to the priority queue. If the size of the queue exceeds \( k \), we remove the element with the lowest frequency. This ensures that only the top \( k \) frequent elements remain in the queue.
4. Finally, we convert the contents of the queue to a list, which contains the top \( k \) frequent elements. You can optionally reverse this list if you want the elements in descending order of frequency.

This approach is efficient and leverages Java 8 features like lambdas for clean and concise code. The use of a min heap (priority queue) ensures that the time complexity is \( O(n \log k) \) rather than \( O(n \log n) \), which would be the case if we were to sort all elements by frequency.
* */

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElementsChatGPT4 {

    public static List<Integer> findTopKFrequent(int[] nums, int k) {
        // Step 1: Create a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a min heap using PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        // Step 3: Keep k top frequent elements in the heap
        for (int num : frequencyMap.keySet()) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // Step 4: Convert the heap to a list of top k frequent elements
        List<Integer> topKFrequent = new ArrayList<>(queue);
        Collections.reverse(topKFrequent); // Optional, if you want elements in descending order

        return topKFrequent;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4}; // Example dataset
        int k = 2; // Find top 2 frequent elements

        List<Integer> topK = findTopKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + topK);
    }
}

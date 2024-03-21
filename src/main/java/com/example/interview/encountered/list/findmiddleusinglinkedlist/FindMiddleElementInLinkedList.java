package com.example.interview.encountered.list.findmiddleusinglinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class FindMiddleElementInLinkedList {
    public static <T> T findMiddleElement(LinkedList<T> list) {
        if (list.isEmpty()) {
            return null; // Handle empty list case
        }



        ListIterator<T> forwardIterator = list.listIterator();
        ListIterator<T> backwardIterator = list.listIterator(list.size());
        T middleElement = null;

        while (forwardIterator.nextIndex() < backwardIterator.previousIndex()) {
            middleElement = forwardIterator.next();
            backwardIterator.previous();
        }

        return middleElement;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // List is now 1->2->3->4->5

        Integer middleElement = findMiddleElement(list);
        System.out.println("The middle element is: " + middleElement);
        // Output: The middle element is: 3
    }
}

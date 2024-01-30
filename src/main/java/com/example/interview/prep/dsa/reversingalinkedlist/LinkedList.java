package com.example.interview.prep.dsa.reversingalinkedlist;

class LinkedList {
    ListNode head;

    // Method to reverse the linked list
    public void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move pointers one position ahead
            current = next;
        }

        head = prev;
    }

    // Method to print the linked list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

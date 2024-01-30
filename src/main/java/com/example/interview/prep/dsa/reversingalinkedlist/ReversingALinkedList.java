package com.example.interview.prep.dsa.reversingalinkedlist;

public class ReversingALinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Constructing the linked list 1->2->3->4->5
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        list.printList();

        // Reversing the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}

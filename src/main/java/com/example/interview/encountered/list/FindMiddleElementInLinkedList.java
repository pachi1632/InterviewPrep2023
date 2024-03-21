package com.example.interview.encountered.list;
/*
FindMiddleElementInLinkedList
System.out.println(list.get(list.size()/2));
* */
public class FindMiddleElementInLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // head of the list

    // Function to add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Function to find and return the middle element of the linked list
    public Node findMiddle() {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next; // moves one node at a time
            fastPointer = fastPointer.next.next; // moves two nodes at a time
        }
        return slowPointer; // when fastPointer reaches the end, slowPointer is at the middle
    }

    public static void main(String[] args) {
        FindMiddleElementInLinkedList list = new FindMiddleElementInLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        // List is now 1->2->3->4->5


        Node middle = list.findMiddle();
        System.out.println("The middle element is: " + (middle != null ? middle.data : "empty list"));
        // Output: The middle element is: 3
    }
}


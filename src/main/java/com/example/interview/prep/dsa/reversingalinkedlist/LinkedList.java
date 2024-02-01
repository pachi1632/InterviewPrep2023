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

    public void rotate(int k)
    {
        if (k != 0) {
            ListNode walk = head;
            ListNode prev = null;

            //this loop runs k times and walk pointer moves k nodes ahead
            //and reaches new head node.
            while( k-- > 0 && walk!=null )
            {
                prev = walk;
                walk = walk.next;
            }
            //considering cases where k>=n so nothing needs to be done.
            /*if(walk==null) return head;*/



            //since prev points to the node placed before new head it is new tail
            //or the last node of new list so we store null in it's link part.
            prev.next = null;

            reverse();

            //we store the walk pointer which gives the first node in newHead.
            head = walk;

            //we keep moving the walk pointer till we reach the last node of list.
            while( walk.next != null )
                walk = walk.next;

            //connecting last node of old list to old head.
            walk.next = prev;


        }


    }
}

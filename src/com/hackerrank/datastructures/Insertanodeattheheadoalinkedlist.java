package com.hackerrank.datastructures;

public class Insertanodeattheheadoalinkedlist {



    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
     static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);

        if (llist == null) {
            return new_node;
        }

        new_node.next = llist;

        return new_node;

    }

}
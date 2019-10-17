package com.hackerrank.datastructures;

public class ReverseALinkedList {



    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode node) {

        SinglyLinkedListNode previos = null;
        SinglyLinkedListNode current = node;
        SinglyLinkedListNode next = null;

        while (current != null) {

            next = current.next;

            current.next = previos;

            previos = current;
            current = next;

        }

        node = previos;
        return node;
    }

}
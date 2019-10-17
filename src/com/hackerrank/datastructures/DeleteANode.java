package com.hackerrank.datastructures;

public class DeleteANode {



    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        SinglyLinkedListNode start_node;

        if (position == 0) {

            start_node = head.next;

            head.next = null;
            return start_node;
        }
        SinglyLinkedListNode cur_node = head;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode prev = null;

        int counter = 0;
        while (cur_node.next != null && counter < position) {
            counter++;
            prev = cur_node;
            cur_node = cur_node.next;
        }

        next = cur_node.next;
       // prev = cur_node;
        cur_node.next = null;
        prev.next = next;

        return head;
    }

}
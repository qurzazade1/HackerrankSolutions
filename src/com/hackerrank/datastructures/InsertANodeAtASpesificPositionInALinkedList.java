package com.hackerrank.datastructures;

public class InsertANodeAtASpesificPositionInALinkedList {

	// Complete the insertNodeAtPosition function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

           SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
           if(position==0) {
               new_node.next=head;
               return new_node;
           }
    SinglyLinkedListNode cur_node = head;
    SinglyLinkedListNode next = null;
                
       int counter=1;
            while(cur_node.next!=null&&counter<position)
            {
                counter++;
                
                cur_node=cur_node.next;
            }
    
            next=cur_node.next;
            cur_node.next=new_node;
            new_node.next=next;
            return head;
        }
}
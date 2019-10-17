package com.hackerrank.datastructures;

class SinglyLinkedListNode {
	int data;
	SinglyLinkedListNode next;

	SinglyLinkedListNode(int data) {
		this.data = data;
	}
}

public class InsertANodeAttheTailOfaLinkedList {

	// Complete the insertNodeAtTail function below.

	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

		SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);

		if (head == null) {
			return new_node;
		}
		SinglyLinkedListNode cur_node = head;

		while (cur_node.next != null) {
			cur_node = cur_node.next;
		}
		cur_node.next = new_node;
		return head;
	}

}
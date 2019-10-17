package com.hackerrank.datastructures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertingANodeIntoASortedDoublyLinkedList {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the sortedInsert function below.

	/*
	 * For your reference:
	 *
	 * DoublyLinkedListNode { int data; DoublyLinkedListNode next;
	 * DoublyLinkedListNode prev; }
	 *
	 */
	static DoublyLinkedListNode getNode(int data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		newNode.data = data;
		newNode.prev = newNode.next = null;
		return newNode;

	}

	static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
		DoublyLinkedListNode newNode = getNode(data);

		DoublyLinkedListNode current;
		if (head == null)
			head = newNode;
		else if (head.data >= newNode.data) {
			newNode.next = head;
			newNode.next.prev = newNode;
			head = newNode;
		}

		else {
			current = head;
			while (current.next != null && current.next.data < newNode.data)
				current = current.next;

			newNode.next = current.next;
			if (current.next != null)
				newNode.next.prev = newNode;

			current.next = newNode;
			newNode.prev = current;

		}
		return head;
}
}
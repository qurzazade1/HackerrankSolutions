package com.hackerrank.datastructures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindMergePointOfTwoLists {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the findMergeNode function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static int findMergeNode(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {

		int headALen = 0, headBLen = 0;
		SinglyLinkedListNode headAcopy = headA, headBcopy = headB;
		while (headAcopy != null) {
			headAcopy = headAcopy.next;
			headALen++;
		}
		while (headBcopy != null) {
			headBcopy = headBcopy.next;
			headBLen++;
		}
		while (headALen > headBLen) {
			headA = headA.next;
			headALen--;
		}
		while (headBLen > headALen) {
			headB = headB.next;
			headBLen--;
		}
		while (headA != null) {
			if (headA == headB) {
				return headA.data;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return -1;
	}
}
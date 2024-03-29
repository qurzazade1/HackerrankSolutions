package com.hackerrank.datastructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualStacks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(); // Number of cylinders in first stack
		int n2 = in.nextInt(); // Number of cylinders in second stack
		int n3 = in.nextInt(); // Number of cylinders in third stack
		Queue<Integer> s1 = new LinkedList<Integer>(); // First stack of cylinders
		Queue<Integer> s2 = new LinkedList<Integer>(); // Second stack of cylinders
		Queue<Integer> s3 = new LinkedList<Integer>(); // Third stack of cylinders
		int h1 = 0; // Height of the first stack
		int h2 = 0; // Height of the second stack
		int h3 = 0; // Height of the third stack

		int minStack; // The stack with the smallest height

		// Initialize the stacks and their heights
		for (int i = 0; i < n1; i++) {
			int cylinder = in.nextInt();
			s1.add(cylinder);
			h1 += cylinder;
		}

		for (int i = 0; i < n2; i++) {
			int cylinder = in.nextInt();
			s2.add(cylinder);
			h2 += cylinder;
		}

		for (int i = 0; i < n3; i++) {
			int cylinder = in.nextInt();
			s3.add(cylinder);
			h3 += cylinder;
		}
		minStack = Math.min(h1, Math.min(h2, h3));// Initialize minStack with the minimum height

		while (h1 != h2 || h1 != h3)// Heights are not all equal
		{
			// Remove cylinders from stack 1 until your height is <= the smallest
			while (h1 > minStack) {
				h1 -= s1.remove();
			}
			minStack = Math.min(h1, Math.min(h2, h3)); // Recalculate min

			// Remove cylinders from stack 2 until your height is <= the smallest
			while (h2 > minStack) {
				h2 -= s2.remove();
			}
			minStack = Math.min(h1, Math.min(h2, h3)); // Recalculate min

			// Remove cylinders from stack 3 until your height is <= the smallest
			while (h3 > minStack) {
				h3 -= s3.remove();
			}
			minStack = Math.min(h1, Math.min(h2, h3)); // Recalculate min
		}
		System.out.println(minStack);// All stacks are equal so minStack represents their height
	}
}

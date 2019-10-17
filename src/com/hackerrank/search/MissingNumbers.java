package com.hackerrank.search;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int arr1[] = new int[10000];
		int arr2[] = new int[10000];
		int T = kb.nextInt();
		for (int i = 0; i < T; i++) {
			int num = kb.nextInt();
			arr1[num] += 1;
		}
		int N = kb.nextInt();
		for (int j = 0; j < N; j++) {
			int num = kb.nextInt();
			arr2[num] += 1;
		}
		for (int k = 0; k < 10000; k++) {
			if (Math.abs(arr1[k] - arr2[k]) > 0)
				System.out.print(k + " ");
			else
				continue;

		}
	}
}

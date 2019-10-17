package com.hackerrank.implementaion;

import java.math.*;
import java.util.regex.*;

import java.util.*;

public class CircularArrayRoataion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		int i = 0;
		int[] b = new int[n];

		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();

		}
		if (k > n)
			k = k % n;
		for (int b_i = (Math.abs(n - k)); b_i < n; b_i++) {
			b[i] = a[b_i];
			i++;
		}
		for (int b_i = 0; b_i < (Math.abs(n - k)); b_i++) {
			b[i] = a[b_i];
			i++;
		}
		for (int a0 = 0; a0 < q; a0++) {
			int m = in.nextInt();
			System.out.println(b[m]);
		}
	}
}

package com.hackerrank.search;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerlandRadioTransmitters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
		}

		int numOfTransmitters = 0;
		int i = 0;

		Arrays.sort(x);
		while (i < n) {
			numOfTransmitters++;
			int loc = x[i] + k;

			while (i < n && x[i] <= loc)
				i++;
			loc = x[--i] + k; // this is where we place the transmitter

			while (i < n && x[i] <= loc)
				i++;
		}
		System.out.println(numOfTransmitters);
	}
}

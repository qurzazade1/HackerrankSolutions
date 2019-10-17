package com.hackerrank.implementaion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();

		long countForSubstring = 0;
		long totalCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				countForSubstring++;
			}
		}

		long divisor = n / s.length();

		totalCount += divisor * countForSubstring;

		long remainder = n % s.length();

		for (int i = 0; i < remainder; i++) {
			if (s.charAt(i) == 'a') {
				totalCount++;
			}
		}

		System.out.println(totalCount);
	}
}

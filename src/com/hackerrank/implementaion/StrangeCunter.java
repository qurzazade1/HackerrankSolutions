package com.hackerrank.implementaion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrangeCunter {

	// Complete the strangeCounter function below.
	static long strangeCounter(long t) {

		long len = 3;
		long cur = 3;

		for (;;) {
			if (t <= len) {
				cur -= t - 1;
				break;
			}
			t -= len;
			cur *= 2;
			len *= 2;
		}

		return cur;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		long t = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = strangeCounter(t);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

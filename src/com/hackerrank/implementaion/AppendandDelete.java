package com.hackerrank.implementaion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppendandDelete {
	static String appendAndDelete(String s, String t, int k) {
		int j = 0;
		for (int i = 0; i < Math.min(t.length(), s.length()); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			} else {
				j++;
			}
		}

		if ((s.length() + t.length() - 2 * j) > k) {
			return "No";
		}

		if ((s.length() + t.length() - 2 * j) % 2 == k % 2) {

			return "Yes";
		}

		if (s.length() + t.length() < k) {
			return "Yes";
		}

		return "No";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String t = scanner.nextLine();

		int k = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = appendAndDelete(s, t, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

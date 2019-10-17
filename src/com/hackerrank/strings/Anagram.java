package com.hackerrank.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagram {

	// Complete the anagram function below.
	static int countManipulations(String s1, String s2) {
		int count = 0;

		int char_count[] = new int[26];
		for (int i = 0; i < s1.length(); i++)
			char_count[s1.charAt(i) - 'a']++;

		for (int i = 0; i < s2.length(); i++)
			if (char_count[s2.charAt(i) - 'a']-- <= 0)
				count++;

		return count;
	}

	static int anagram(String s) {

		return s.length() % 2 == 0 ? countManipulations(s.substring(0, s.length() / 2), s.substring(s.length() / 2))
				: -1;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = anagram(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}

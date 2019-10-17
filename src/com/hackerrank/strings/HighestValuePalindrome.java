package com.hackerrank.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HighestValuePalindrome {

	// Complete the highestValuePalindrome function below.
	static String highestValuePalindrome(String s, int n, int k) {

		return maximumPalinUsingKChanges(s, k);
	}

	static String maximumPalinUsingKChanges(String str, int k) {
		char palin[] = str.toCharArray();
		String ans = "";
		int l = 0;
		int r = str.length() - 1;

		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				palin[l] = palin[r] = (char) Math.max(str.charAt(l), str.charAt(r));
				k--;
			}
			l++;
			r--;
		}

		if (k < 0) {
			return "-1";
		}

		l = 0;
		r = str.length() - 1;

		while (l <= r) {
			// At mid character, if K>0 then change
			// it to 9
			if (l == r) {
				if (k > 0) {
					palin[l] = '9';
				}
			}

			if (palin[l] < '9') {
				if (k >= 2 && palin[l] == str.charAt(l) && palin[r] == str.charAt(r)) {
					k -= 2;
					palin[l] = palin[r] = '9';
				}

				else if (k >= 1 && (palin[l] != str.charAt(l) || palin[r] != str.charAt(r))) {
					k--;
					palin[l] = palin[r] = '9';
				}
			}
			l++;
			r--;
		}
		for (int i = 0; i < palin.length; i++)
			ans += palin[i];
		return ans;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		String s = scanner.nextLine();

		String result = highestValuePalindrome(s, n, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

package com.hackerrank.greedy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LargestPermutaion {
	static int[] largestPermutation(int k, int[] arr) {
		int n = arr.length;
		int[] pos = new int[n + 1];
		for (int i = 0; i < n; ++i)
			pos[arr[i]] = i;
		for (int i = 0; i < n && k > 0; ++i)

		{
			if (arr[i] == n - i)
				continue;

			int temp = pos[n - i];

			pos[arr[i]] = pos[n - i];

			pos[n - i] = i;

			int tmp1 = arr[temp];
			arr[temp] = arr[i];
			arr[i] = tmp1;

			--k;

		}
		return arr;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] result = largestPermutation(k, arr);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

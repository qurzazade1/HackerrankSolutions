package com.hackerrank.greedy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuvkBalance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int maxLuck = 0;
		ArrayList<Integer> importantContests = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int luck = input.nextInt();
			int important = input.nextInt();

			if (important != 1) {
				maxLuck += luck;
			}

			else
				importantContests.add(luck);
		}
		Collections.sort(importantContests, Collections.reverseOrder());

		for (int i = 0; i < importantContests.size(); i++) {
			if (i < k)
				maxLuck += importantContests.get(i);
			else
				maxLuck -= importantContests.get(i);
		}

		System.out.println(maxLuck);
	}
}

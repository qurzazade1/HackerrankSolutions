package com.hackerrank.greedy;

import java.io.*;
import java.util.*;

public class GridChallenge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		StringBuilder output = new StringBuilder("");
		for (int t = 0; t < T; t++) {

			int n = input.nextInt();
			input.nextLine();
			char[][] grid = new char[n][n];
			for (int i = 0; i < n; i++) {
				grid[i] = input.nextLine().toCharArray();
				Arrays.sort(grid[i]);
			}

			if (checkColumns(grid))
				output.append("YES\n");
			else
				output.append("NO\n");

		}
		System.out.print(output);
	}

	static boolean checkColumns(char[][] grid) {
		for (int i = 0; i < grid[0].length; i++) {// column
			for (int j = 1; j < grid.length; j++) {// row
				if (grid[j][i] < grid[j - 1][i])
					return false;
			}
		}
		return true;
	}
}

package com.hackerrank.implementaion;

import java.io.*;
import java.util.*;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for (int i = 0; i < T; i++) {
			int n = input.nextInt() - 1;
			int a = input.nextInt();
			int b = input.nextInt();

			if (a == b) {
				System.out.println(a * n + " ");
				continue;
			}

			int tmp = a;
			a = Math.min(a, b);

			b = (a == b) ? tmp : b;

			int min = a * n;
			int max = b * n;

			for (int finalSteps = min; finalSteps <= max; finalSteps += (b - a)) {
				System.out.print(finalSteps + " ");
			}

			System.out.println();

		}
	}
}

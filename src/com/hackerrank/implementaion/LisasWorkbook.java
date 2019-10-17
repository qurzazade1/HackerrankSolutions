package com.hackerrank.implementaion;

import java.io.*;
import java.util.*;

public class LisasWorkbook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int pageNumber = 1;
		int specialProblems = 0;

		for (int i = 0; i < n; i++) {
			int problems = input.nextInt();
			int currentProblem = 1; // Set the current problem for each chapter to 1 on start

			while (problems > 0) // Loop through all problems for this chapter
			{
				int pageProblems = problems;

				if (pageProblems - k >= 0) // Determine if there are enough problems left for a full page
				{
					pageProblems = k;
				}

				while (pageProblems > 0) {

					if (pageNumber == currentProblem) // If the current problem we are adding to a page is the same
														// index as the
					{ // page increment specialProblems
						specialProblems++;
					}
					currentProblem++;
					pageProblems--;
				}

				problems -= k; // Remove the problems we have added to the page
				pageNumber++; // Move to next page
			}
		}
		System.out.println(specialProblems);

	}
}

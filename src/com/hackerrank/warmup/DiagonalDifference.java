package com.hackerrank.warmup;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	class Result {

	    /*
	     * Complete the 'diagonalDifference' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	     */


	}

	public class DiagonalDifference {
	   public static void main(String[] args) {
	 
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int array[][] = new int[n][n];
	        int d1 = 0, d2 = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                array[i][j] = in.nextInt();
	                if (i == j) {
	                    d1 = d1 + array[i][j];
	                }
	                if (i + j == n - 1) {
	                    d2 = d2 + array[i][j];
	                }
	            }
	        }
	        System.out.println(Math.abs(d1 - d2));
	    }
	}

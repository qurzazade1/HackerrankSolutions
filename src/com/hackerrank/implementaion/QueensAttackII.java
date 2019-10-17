package com.hackerrank.implementaion;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class QueensAttackII {

	    // Complete the queensAttack function below.
	  static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

	        int obstPosx[] = new int[obstacles.length];
	        int obstPosy[] = new int[obstacles.length];

	        for (int i = 0; i < obstacles.length; i++) {

	            obstPosx[i] = obstacles[i][0];
	            obstPosy[i] = obstacles[i][1];

	        }

	        return numberofPosition(n, k, r_q, c_q, obstPosx, obstPosy);

	    }

	    static int numberofPosition(int n, int k, int x, int y, int obstPosx[], int obstPosy[]) {

	        int d11, d12, d21, d22, r1, r2, c1, c2;
	        d11 = Math.min(x - 1, y - 1);
	        d12 = Math.min(n - x, n - y);
	        d21 = Math.min(n - x, y - 1);
	        d22 = Math.min(x - 1, n - y);

	        r1 = y - 1;
	        r2 = n - y;
	        c1 = x - 1;
	        c2 = n - x;

	        for (int i = 0; i < k; i++) {
	            if (x > obstPosx[i] && y > obstPosy[i] && x - obstPosx[i] == y - obstPosy[i])
	                d11 = Math.min(d11, x - obstPosx[i] - 1);

	            if (obstPosx[i] > x && obstPosy[i] > y && obstPosx[i] - x == obstPosy[i] - y)
	                d12 = Math.min(d12, obstPosx[i] - x - 1);

	            if (obstPosx[i] > x && y > obstPosy[i] && obstPosx[i] - x == y - obstPosy[i])
	                d21 = Math.min(d21, obstPosx[i] - x - 1);

	            if (x > obstPosx[i] && obstPosy[i] > y && x - obstPosx[i] == obstPosy[i] - y)
	                d22 = Math.min(d22, x - obstPosx[i] - 1);

	            if (x == obstPosx[i] && obstPosy[i] < y)
	                r1 = Math.min(r1, y - obstPosy[i] - 1);

	            if (x == obstPosx[i] && obstPosy[i] > y)
	                r2 = Math.min(r2, obstPosy[i] - y - 1);

	            if (y == obstPosy[i] && obstPosx[i] < x)
	                c1 = Math.min(c1, x - obstPosx[i] - 1);

	            if (y == obstPosy[i] && obstPosx[i] > x)
	                c2 = Math.min(c2, obstPosx[i] - x - 1);
	        }

	        return d11 + d12 + d21 + d22 + r1 + r2 + c1 + c2;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] nk = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nk[0]);

	        int k = Integer.parseInt(nk[1]);

	        String[] r_qC_q = scanner.nextLine().split(" ");

	        int r_q = Integer.parseInt(r_qC_q[0]);

	        int c_q = Integer.parseInt(r_qC_q[1]);

	        int[][] obstacles = new int[k][2];

	        for (int i = 0; i < k; i++) {
	            String[] obstaclesRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 2; j++) {
	                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
	                obstacles[i][j] = obstaclesItem;
	            }
	        }

	        int result = queensAttack(n, k, r_q, c_q, obstacles);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

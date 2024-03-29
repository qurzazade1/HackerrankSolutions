package com.hackerrank.implementaion;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class CountingValleys {

	    // Complete the countingValleys function below.
	    static int countingValleys(int n, String s) {

	        int counter = 0;
	        char[] ch = s.toCharArray();

	        Stack<Character> stack = new Stack<Character>();

	        for (int i = 0; i < n; i++) {

	            if (ch[i] == 'U' && (stack.isEmpty() || stack.peek() == 'U')) {
	                stack.push(ch[i]);

	            } else if (ch[i] == 'D' && !stack.isEmpty() && stack.peek() == 'U') {
	                stack.pop();

	            } else if (ch[i] == 'D' && (stack.isEmpty() ||stack.peek() == 'D')) {
	                stack.push('D');

	            } else if (ch[i] == 'U' && !stack.isEmpty() && stack.peek() == 'D') {
	                stack.pop();
	                if (stack.size() == 0) {
	                    counter++;
	                }

	            }

	        }

	        return counter;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int result = countingValleys(n, s);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

package com.hackerrank.implementaion;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	class Result {


	     public static int nonDivisibleSubset(int k, List<Integer> s) {

	        int f[] = new int[k];
	        Arrays.fill(f, 0);

	        for (int i = 0; i < s.size(); i++)
	            f[s.get(i) % k]++;

	        if (k % 2 == 0)
	            f[k / 2] = Math.min(f[k / 2], 1);

	        int res = Math.min(f[0], 1);

	        for (int i = 1; i <= k / 2; i++)
	            res += Math.max(f[i], f[k - i]);

	        return res;
	    }

	}

	public class NonDivisibleSubset {

		public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(firstMultipleInput[0]);

	        int k = Integer.parseInt(firstMultipleInput[1]);

	        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result.nonDivisibleSubset(k, s);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

package com.hackerrank.warmup;
//Java 8
//Rzazada Sadig
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

	public class CompareTheTriplets {

	   static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        ArrayList<Integer> ar = new ArrayList<Integer>();

	        int alice = 0;
	        int bob = 0;

	        for (int i = 0; i < 3; i++) {

	            if (a.get(i) < b.get(i)) {
	                bob++;

	            } else if (a.get(i) > b.get(i)) {
	                alice++;

	            }

	        }
	        ar.add(alice);
	        ar.add(bob);

	        return ar;
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = compareTriplets(a, b);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining(" "))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

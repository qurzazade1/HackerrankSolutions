package com.hackerrank.datastructures;


	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;

	public class FindTheRunningMedian {

	    static double[] runningMedian(int[] a) {

	        int[] temp = new int[a.length];
	        double[] resultArray = new double[a.length];
	        int counter = 0;

	        for (int i = 0; i < a.length; i++) {
	            temp[i] = a[i];
	            counter++;

	            if (i == 0) {
	                resultArray[i] = (double) temp[i];
	                System.out.println("i : " + i + "  " + Arrays.toString(temp));
	            } else {

	                Arrays.sort(temp, 0, i + 1);
	                System.out.println("i : " + i + "  " + Arrays.toString(temp));

	                int val = counter / 2;

	                if (counter % 2 == 0)
	                    resultArray[i] = (temp[val] + temp[val - 1]) / 2.0;
	                else 
	                    resultArray[i] = temp[val];
	            }
	        }
	        System.out.println("\n Result Array : " + Arrays.toString(resultArray));
	        return resultArray;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d://output.txt"));

	        int aCount = Integer.parseInt(scanner.nextLine().trim());

	        int[] a = new int[aCount];

	        for (int aItr = 0; aItr < aCount; aItr++) {
	            int aItem = Integer.parseInt(scanner.nextLine().trim());
	            a[aItr] = aItem;
	        }

	        double[] result = runningMedian(a);

	        for (int resultItr = 0; resultItr < result.length; resultItr++) {
	            bufferedWriter.write(String.valueOf(result[resultItr]));

	            if (resultItr != result.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();
	    }
	}

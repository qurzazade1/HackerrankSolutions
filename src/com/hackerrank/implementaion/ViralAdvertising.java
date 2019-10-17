package com.hackerrank.implementaion;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	import java.util.Scanner;
	public class ViralAdvertising {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        
	        int people = 2;
	        int count  = 2;
	        for (int i = 2; i <= n; i++) {
	            people = (people * 3) / 2;
	            count += people;
	        }
	        System.out.println(count);
	    }
	}

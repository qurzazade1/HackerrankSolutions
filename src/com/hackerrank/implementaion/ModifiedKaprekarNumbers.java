package com.hackerrank.implementaion;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	public class ModifiedKaprekarNumbers {
	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        int p = scan.nextInt();
	        int q = scan.nextInt();
	        boolean exist = false;
	        if(q <= p){
	            System.out.println("INVALID RANGE");
	            return;
	        }

	        String numb = "";
	        String[] digits = new String[2];
	        for(long i = p; i <= q; i++){
	            if (i == 1) {
	                System.out.print(1 + " ");
	            } else {
	                long sqr = i*i;
	                numb = String.valueOf(sqr);
	                if (numb.length() % 2 == 0) {
	                    digits[0] = numb.substring(0, numb.length()/2);
	                    digits[1] = numb.substring(numb.length()/2);
	                } else {
	                    digits[0] = numb.substring(0, (numb.length() - 1)/2);
	                    digits[1] = numb.substring((numb.length() -1)/2);
	                } 
	                int m = 0;
	                int n = 0;
	                
	                if (digits[0] == "" ) {
	                    m = 0;
	                }
	                
	                if (!digits[1].equals("") && !digits[0].equals("")) {
	                  m = Integer.parseInt(digits[0]);
	                  n = Integer.parseInt(digits[1]);
	                }
	                
	                if (i == (m + n) ) { 
	                    System.out.print(i + " ");
	                    exist = true;
	                }
	            }
	        }
	      
	        if (exist == false){
	            System.out.println("INVALID RANGE");
	        }
	    }
	}


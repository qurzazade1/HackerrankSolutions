package com.hackerrank.implementaion;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class DesignerPDFViewer {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = 26;
	        int h[] = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        
	        int maxHeight = 0;//Initialized to 0 because it is below the minimum range for height
	        
	        for(int i = 0; i < word.length(); i++)
	        {
	            if(maxHeight < h[word.charAt(i)-97]) //  determines if the height of the 
	            {                                    //97 is subtracted because we are using 
	                 maxHeight = h[word.charAt(i)-97];
	            }
	        }
	        
	        System.out.println(word.length() * maxHeight);
	    }
	}

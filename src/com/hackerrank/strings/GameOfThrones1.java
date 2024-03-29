package com.hackerrank.strings;

import java.io.*;
import java.util.*;


public class GameOfThrones1 {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String s = input.nextLine();
	        
	        Map<Character, Integer> letters = new HashMap<>();
	        for(char c : s.toCharArray())
	        {
	            if(letters.containsKey(c))
	                letters.put(c, letters.get(c) + 1);
	            else
	                letters.put(c, 1);
	        }
	        
	        int odd = 0;
	        int even = 0;
	        for(Integer frequency : letters.values())
	        {
	            if(frequency % 2 == 1)
	            {
	                odd++;
	                continue;
	            }
	                
	            if(frequency % 2 == 0)
	                even++;
	        }
	        
	        if(odd > 1) 
	            System.out.println("NO");
	        else
	            System.out.println("YES");
	        
	    }
	}

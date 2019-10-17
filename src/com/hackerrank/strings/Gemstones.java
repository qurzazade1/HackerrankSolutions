package com.hackerrank.strings;



import java.io.*;
import java.util.*;

public class Gemstones {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        Set<Character> gemstones = stringToSet(input.nextLine()); //Set of gemstones
        
        for(int i=1; i<n ;i++){
            gemstones.retainAll(stringToSet(input.nextLine())); //Perform intersection
        }
        System.out.print(gemstones.size());
    }
    
    
    
    
    public static Set<Character> stringToSet(String s) //Converts String to Character set
    {
        Set<Character> set = new HashSet<Character>(26);
        for (char c : s.toCharArray())
            set.add(Character.valueOf(c));
        return set;
    }
}

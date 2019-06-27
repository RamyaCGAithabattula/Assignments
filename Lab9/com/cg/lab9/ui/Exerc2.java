package com.cg.lab9.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exerc2 {
	
	public static void countCharacters(char b[])
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 
		for (char c : b) { 
			if (charCountMap.containsKey(c)) { 
				charCountMap.put(c, charCountMap.get(c) + 1); 
			} 
			else { 
				charCountMap.put(c, 1); 
			} 
		} 
		for (Map.Entry entry : charCountMap.entrySet()) { 
			System.out.println(entry.getKey() + " " + entry.getValue()); 
		} 
	}
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of characters");
			int a = scan.nextInt();
			char ch[] = new char[a];
			System.out.println("The no of characters are ");
			for(int k = 0; k<a ; k++)
			{
				ch[k] = scan.next().charAt(0);
			}
			countCharacters(ch);
			scan.close();
	}


}


package com.cg.lab3.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exe4 {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		char array[]=str.toCharArray();
		countArray(array);
		
	}

	private static void countArray(char array[]) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> m=new TreeMap<>();
		int i=0; 
		while(i<array.length)
		{
			if(m.containsKey(array[i]))
				m.put(array[i],m.get(array[i])+1);
			else
				m.put(array[i], 1);
			i++;
			
		}
		for(Map.Entry<Character,Integer> e: m.entrySet())
			{
				System.out.println("Character "+e.getKey()+" is Repeated  "+e.getValue()+" times");
			}
		}

}

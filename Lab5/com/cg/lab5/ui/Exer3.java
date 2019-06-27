package com.cg.lab5.ui;

import java.util.Scanner;

public class Exer3 {
	
		static boolean isPrime(int n) 
		{ 
		if (n <= 1) 
		    return false; 
		for (int i = 2; i < n; i++) 
		    if (n % i == 0) 
		        return false; 
		  
		return true; 
		} 

		static void printPrime(int n) 
		{ 
		for (int i = 2; i <= n; i++)  
		{ 
		    if (isPrime(i)) 
		        System.out.print(i + " "); 
		} 
		}
		public static void main (String[] args) {
			// TODO Auto-generated method stub

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number");
			int n=sc.nextInt();
			printPrime(n); 
			
			
		}
}
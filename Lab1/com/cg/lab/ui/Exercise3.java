package com.cg.lab.ui;

import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
		public static void main(String[] args) throws IOException 
		{
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number");
			a=sc.nextInt();
			boolean x=checkNumber(a);
			if(x==true)
				System.out.println("Given number is in Increasing Order");
			else
				System.out.println("Given number is not in Increasing Order");
			
		}

		private static boolean checkNumber(int n) {
			do
			{
			int b=0,c=0;
			b=n%10;
			n=n/10;
			c=n%10;
			if(c>b)
				return false;
			}
			while(n>0);
			return true;
		}
}


package com.cg.lab.ui;

import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
		public static void main(String[] args) throws IOException 
		{
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number");
			a=sc.nextInt();
			boolean x=checkPower(a);
			if(x==true)
				System.out.println("The given number is power of 2");
			else
				System.out.println("The given number is not a power of 2");
			
		}

		private static boolean checkPower(int n) {
			do
			{
				int b=0;
				b=n%2;
				n=n/2;
				if(b!=0)
					return false;
			}while(n>1);
			return true;
		}
	
}

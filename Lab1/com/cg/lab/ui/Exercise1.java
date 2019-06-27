package com.cg.lab.ui;

import java.util.Scanner;

public class Exercise1 {
	
       public static void main(String args[])
		{
			int a,sum=0;
			Scanner sc=new Scanner(System.in);        //Taking input
			System.out.println("Enter Number");
			a=sc.nextInt();
			sum=calculateSum(a);
			System.out.println("Sum is "+sum);
		}
		
		private static int calculateSum(int n)        //Function to calculate the sum
			{
				int sum=0;
				int i=1;
				for(i=1;i<=n;i++)
				{
					if(i%3==0||i%5==0)
					{
						sum=sum+i;
					}
				}
				return sum;
			}

}


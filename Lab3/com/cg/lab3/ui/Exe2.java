package com.cg.lab3.ui;

public class Exe2 {

	public static void main(String args[])
	{
		String [] array= {"Abc","Def","Xyz","Ijk","Mno","PQr"};
		int n=array.length;
		System.out.println("Length : "+n);
		int a=n/2;
		for(int i=0;i<n;i++)
		{
			if(i<=a)
			array[i]=array[i].toUpperCase();
			else
			array[i]=array[i].toLowerCase();
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(array[i]);
		}
	}
}

package com.cg.lab13;

interface Printable1
{
	void print();
}

public class Ex5 {
	
	public  void factorial(){  
		  int i,fact=1;  
		  int num=5;                
		  for(i=1;i<=num;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial is: "+fact);   
		 }  


	public static void main(String[] args) {  
        Ex5 methodReference = new Ex5(); // Creating object  
        Printable1 printable = methodReference::factorial ;  
        printable.print();  
            
    }
	
	
}

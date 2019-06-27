package com.cg.lab5.ui;

import com.cg.lab5.ui.Validator;
import com.cg.eis.exception.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exer5 {
	
	public static void main(String[] args) throws IOException, UserException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Age");
		int age=0;
		
		 while(true)
		  {
			 String input =br.readLine();
			  boolean ch1=Validator.validatedata(input, Validator.age);
			  if(ch1==true)
			  {
				  age=Integer.parseInt(input);
				  
					  		if(age<15)
					  			{
					  				throw new UserException("Enter age above than 15");  
					  			}
					  		else if(age>200) 
					  			{
					  				System.out.println("Enter age below 200");
					  			}  
					  		else
					  		{
					  			System.out.println("Successfully recorded");
					  			break;
					  		}
		       }
			  else
				  System.out.println("Re Enter age"); 
			  
		  }
		
	}
}

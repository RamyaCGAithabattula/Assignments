package com.cg.lab5.ui;

import com.cg.lab5.ui.Validator;
import com.cg.eis.exception.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exer4 {
	
	public static void main(String[] args) throws UserException, IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter FirstName");
		String F="";
		String L="";
		 while(true)
		  {
			  F=br.readLine();;
			  boolean ch1=Validator.validatedata(F, Validator.name);
			  if(ch1==true)
			  {
				  if(F.isEmpty())
				       throw new UserException("FristName Field cannot be blank");
				  else
				      break;  
		       }
			  else
				  System.out.println("Re Enter Name"); 
		  }
		
		
		System.out.println("Enter LastName :- ");
		while(true)
		  {
			  L=br.readLine();;
			  boolean ch1=Validator.validatedata(L, Validator.name);
			  if(ch1==true)
			  {
				 
				  if(L.isEmpty())
				       throw new UserException("LastName Field cannot be blank");
				  else
				      break;  
		       }
			  else
				  System.out.println("Re Enter Name"); 
			  
		  
		  }
     }

}

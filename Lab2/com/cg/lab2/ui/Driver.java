package com.cg.lab2.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class Driver {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Add User Interface Here;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Book book_ob=new Book();
		
		while(true)
		{
		System.out.println("WELCOME TO LIBRARY");
		System.out.println("================================================");
		System.out.println("1.WrittenItem");
		System.out.println("2.MediaItem");
		System.out.println("3.Exit");
		System.out.println("================================================");
		System.out.println("Enter Your Choice");
		String choice = br.readLine();
		System.out.println("================================================");
		
		switch(choice)
		{
		case "1"://WrittenItem 
				System.out.println("1.Books");
				System.out.println("2.Journal Paper");
				System.out.println("3.Exit");
				System.out.println("================================================");
				System.out.println("Enter Your Choice");
				String choice1 = br.readLine();
				System.out.println("================================================");
				
				switch(choice1)
				{
				case "1"://Books
						System.out.println("1.CheckIn");
						System.out.println("2.CheckOut");
						System.out.println("3.addItem");
						System.out.println("4.Print");
						System.out.println("5.Exit"); 
						System.out.println("================================================");
						System.out.println("Enter Your Choice");
						String choice2 = br.readLine();
						System.out.println("================================================");
						switch(choice2)
						{
						case "1":
								System.out.println("Enter Book ID For CheckIn:");
								String id=br.readLine();
								int bookId=Integer.parseInt(id);
								book_ob.checkIn(bookId);
								break;
						case "2": 
								System.out.println("Enter BookID For CheckOut:");
								id=br.readLine();
								bookId=Integer.parseInt(id);
								book_ob.checkOut(bookId);
							break;
						case "3":
								System.out.println("Enter Book ID");
								int id1=Integer.parseInt(br.readLine());
								System.out.println("Enter Book Title/Name");
								String title=br.readLine();
								System.out.println("Enter AuthorName ");
								String author=br.readLine();
								System.out.println("Enter NumberofCopies");
								int noCopies=Integer.parseInt(br.readLine());
								book_ob.addItem(id1,title,author,noCopies);
							break;
						case "4": 
								book_ob.print();
							break;
						case "5":System.exit(0); 
								break;
						default: System.out.println("Invalid Choice");
								break;
						}
						break;
				case "2": 
						System.out.println();
						break;
				case "3":System.exit(0); 
						break;
				default: System.out.println("Invalid Choice");
						break;
				}
				break;
		case "2": 
				break;
		case "3":System.exit(0); 
				break;
		default: System.out.println("Invalid Choice");
				break;
		}
		
		
		
		}
	}
		
}

package com.cg.lab13;

interface Printable{  
    void print();  
}  
public class Ex4 {  
	
  
	int id;
	String name;
	
	
	public Ex4() {
		// TODO Auto-generated constructor stub
	}
	
	
    public Ex4(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public void saySomething(){  
        System.out.println("Hello, this is class with main");  
    }  
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	} 
	
	public static void main(String[] args) {  
           Ex4 methodReference = new Ex4(); // Creating object  
           Printable printable = methodReference::saySomething;  
           printable.print();  
            
    }

 
}  
package com.cg.eis.exception;

public class InvalidInputException extends Exception {
	
	public InvalidInputException() {
		// TODO Auto-generated constructor stub
	}
	public InvalidInputException(String msg) {
		// TODO Auto-generated constructor stub
		super (msg);
		
	}
	@Override
	public String toString() {
		return "InvalidInputException - "+super.getMessage();
	}
}

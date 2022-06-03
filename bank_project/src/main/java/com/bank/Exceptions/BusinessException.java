package com.bank.Exceptions;
//Created a class for exceptions
//Auto-generated all the exceptions to make sure it catches all the errors in the program!
public class BusinessException extends Exception{

	public BusinessException() {
		super(); //can be used to invoke immediate parent class constructor.
		// TODO Auto-generated constructor
	}

	public BusinessException(final String message) {
		super(message); // a reference variable that is used to refer parent class objects
		// TODO Auto-generated constructor
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor
	}

	public BusinessException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor
	}
}
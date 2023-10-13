package com;

/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)
 * */
import java.util.TooManyListenersException;

public class ExceptionLineTooLong extends TooManyListenersException {
	int errorNo;
	String errorMessage;

	public ExceptionLineTooLong(int errorNo, String errorMessage) {
		super();
		this.errorNo = errorNo;
		this.errorMessage = errorMessage;
		
	}


}

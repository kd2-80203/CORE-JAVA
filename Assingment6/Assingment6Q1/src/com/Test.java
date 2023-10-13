/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)
 * */

package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String s=sc.nextLine();
		
		try {
		if(s.length()>80)
			throw new ExceptionLineTooLong(12,"Length is More than 80 character");
		System.out.println("The String is : "+s);
		}
		catch(ExceptionLineTooLong e){
			System.out.println(e.errorMessage);
		}
		
		System.out.println("DONE");

	}

}

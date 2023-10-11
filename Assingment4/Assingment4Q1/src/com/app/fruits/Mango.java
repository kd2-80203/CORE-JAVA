package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruits {

	
	
	
	public Mango() 
	{
		setName("Mango");
		setFresh(true);	
	}

	public Mango(String name, String colour, double weight, boolean isFresh) {
		super(name, colour, weight, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept()
	{
		System.out.println("Enter details for Mango");
		super.accept();
	}
	    
	@Override
	public String taste()
	{
	  return"sweet";
	}
}

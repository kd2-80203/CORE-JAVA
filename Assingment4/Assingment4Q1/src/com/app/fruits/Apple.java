package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruits 
{

	public Apple()
	{
		setName("Apple");
		setFresh(true);
		
	}
	
	public Apple(String name, String colour, double weight, boolean isFresh) 
	{
		super(name, colour, weight, isFresh);		
	}
	@Override 
	public void accept()
	{
		System.out.println("Enter the details for Apple");
		super.accept();
		
	}

	
	@Override
	public String taste()
	{
      return"sweet n sour";
	}
		
}

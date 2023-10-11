package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruits
{
	public Orange() 
	{
		setName("Orange");
		setFresh(true);	
	}
    @Override
	public void accept()
	{
		System.out.println("Enter dwtails for Orange : ");
		super.accept();
		
	}
	
    @Override 
	public String taste()
	{
	   return"sour";
	}
}

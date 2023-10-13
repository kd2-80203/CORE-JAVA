package com;

public class Invariant extends Exception {
	
	float radius;
	String errorMessage;
	
	
	public Invariant(float radius, String errorMessage) {
		super();
		this.radius = radius;
		this.errorMessage = errorMessage;
	}
	
	public void showError()
	{
		System.out.println("Enter radidus is : "+this.radius);
		System.out.println(this.errorMessage);
	}
	
	

}

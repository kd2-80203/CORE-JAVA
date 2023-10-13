package com;
import java.util.Scanner;
/*Q2. Build a new Circle class with the following basic features:



Attributes:
o Center point - Build instance variables for the circle’s center point (use Point2D class
objetc).
o Diameter - Build an instance variable for the circle’s diameter (myDiameter also
represented as a double value).
Behaviors
o Default constructor - Build a default constructor that initializes the circle’s center
point to (0, 0) and its diameter to 100.
o Accessor methods - Build accessor methods for the two center coordinates and the
diameter.
Invariant
o The circle’s diameter should always be non-negative. maintain the integrity of each
circle object by ensuring that the class invariant (that the diameter should be non-
negative) is true at all times.
o
If the diameter is negative then throw user defined exception.
 * */
public class Circle 
{

	float diameter;
	Point2D point;

    public Circle() 
    {
		
		this.diameter = 100;
		this.point = new Point2D(0,0);
	}
	
	public Circle(float diameter, int x,int y) throws Invariant
	{
		if(diameter<0)
			throw new Invariant(this.diameter,"Pls enter the positive value for daimeter");
		this.diameter = diameter;
		this.point = new Point2D(x,y);
	}
	
	public void accept() throws Invariant
	{
		System.out.println("Enter value of Diameter Circle");
		float d= new Scanner(System.in).nextFloat();
		if(d<0)
			throw new Invariant(this.diameter,"Pls enter the positive value for daimeter");
		this.diameter = d;
		
		System.out.println("Enter value of X co-ordinate");
		int x=new Scanner(System.in).nextInt();
		System.out.println("Enter value of Y co-ordinate");
		int y=new Scanner(System.in).nextInt();
		
	}
	
	public void calculateArea()
	{
		System.out.println("The area of Circle is : "+this.diameter*this.diameter*3.14);
	}
	

}

/*Q1 Apply inheritance n polymorphism
a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
c) Add suitable constructors.
d) Override toString correctly to return state of all fruits (including : name ,color , weight )
e) Add a taste() method : public String taste()
For Fruit : it should return "no specific taste"
Apple : should return "sweet n sour"
Mango : should return "sweet"
Orange : should return "sour"
f) Add all of above classes under the package "com.app.fruits"
g) Create java application FruitBasket , with main method , as a tester
h) Prompt user for the basket size n create suitable data structure and give options
0. Exit
1. Add Mango
case 1 : boundary checking
basket[counter++]=new Mango(nm,weight,color);
break;
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.
4. Display names of all fruits in the basket.
eg : for-each --- null checking --getName()
5. Display name,color,weight , taste of all fresh fruits , in the basket.
eg : for-each , null checking --toString , taste, isFresh : getter
6. Display tastes of all stale(not fresh) fruits in the basket.
7. Mark a fruit as stale
i/p : index
eg : setter : isFresh : false
o/p : error message (in case of invalid index) or mark it stale
8. Mark all sour fruits stale (optional)
eg : for-each , taste --equals(String)
 * */

package com.app.fruits;

import java.util.Scanner;

public class Fruits {
	
	private String name;
	private String colour;
	private double weight;
	private boolean isFresh=true;
	
	public Fruits()
	{
		
	}
	
	public Fruits(String name, String colour, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		this.isFresh = isFresh;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}


	@Override
	public String toString() {
		return "Fruits [name=" + name + ", colour=" + colour + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}
	
	/*public String taste()
For Fruit : it should return "no specific taste"
Apple : should return "sweet n sour"
Mango : should return "sweet"
Orange : should return "sour"
	 * */
	
	public String taste()
	{
		return"no specific taste";
	}
	
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Pls enter the weight");
		float weight=sc.nextFloat();
		System.out.println("Pls enter the colour");
		String colour=sc.next();
		this.colour=colour;
		this.weight=weight;
	}
	

}












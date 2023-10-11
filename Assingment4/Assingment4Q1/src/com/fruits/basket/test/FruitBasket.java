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

package com.fruits.basket.test;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;


public class FruitBasket {
	
	public static int menu()
	{
		
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits in the basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
        System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional)");
		System.out.println("0.EXIT");
		int choise;
		choise=new Scanner(System.in).nextInt();
		return choise;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		Fruits fruits=new Fruits();
//		Apple apple=new Apple();
//		Mango mango=new Mango();
//		Orange orange=new Orange();
		
		System.out.println("Enter the Size Of Basket");
		int size=sc.nextInt();
		
		Fruits fruitBasket[]=new Fruits[size];
	    int counter=0;
		
		
		int choise;
		while((choise=menu())!=0)
		{
			
			switch (choise) 
			{
			case 1:
				if(counter<size)
				{
				Fruits mango=new Mango();
				mango.accept();
				fruitBasket[counter]=mango;
				counter++;
				}
				else
            	{
            		System.out.println("The basket is filled compltely");
            	}
				break;
				
				
				
				
            case 2:
            	if(counter<size)
				{
				Fruits orange=new Orange();
				orange.accept();
				fruitBasket[counter]=orange;
				counter++;
				}
            	else
            	{
            		System.out.println("The basket is filled compltely");
            	}
				break;
           
				
				
            case 3:
            	if(counter<size)
				{
				Fruits apple=new Apple();
				apple.accept();
				fruitBasket[counter]=apple;
				counter++;
				}
            	else
            	{
            		System.out.println("The basket is filled compltely");
            	}
				
				break;
            
				
				
            case 4://Display names of all fruits in the basket
				for(Fruits fruits:fruitBasket)
				{
					System.out.println("The name is : "+fruits.getName());
				}
				break;

				
				
            case 5://Display name,color,weight , taste of all fresh fruits , in the basket
            	for(Fruits fruits:fruitBasket)
				{
            		if(fruits.isFresh())
            		{
            			System.out.println(fruits.toString()+" Taste = "+fruits.taste());
            		}
					
				}
				break;
            
				
				
				
            case 6://6. Display tastes of all stale(not fresh) fruits in the basket
            	for(Fruits fruits:fruitBasket)
				{
            		if(!fruits.isFresh())
            		{
            			System.out.println(fruits.toString()+" Taste = "+fruits.taste());
            		}
					
				}
				break;
           
				
				
				
            case 7:// Mark a fruit as stale
            	for(Fruits fruits:fruitBasket)
				{
            		if(fruits.isFresh())
            		{
            		System.out.println(fruits.toString()+" Taste = "+fruits.taste());
            		System.out.println("Are you want to mark this fruit to Stale");
            		System.out.println("1-YES,0-NO)");
            		int a=sc.nextInt();
            		if(a==1)
            		{
            			fruits.setFresh(false);
            			System.out.println("Successfully Mark as a Stale");
            		}
            		}
            		
				}
				
				break;
            
            
				
				
				
            case 8://Mark all sour fruits stale (optional)
            	String s;
            	for(Fruits fruits:fruitBasket)
				{
            		if((s=fruits.taste())=="sour")
            		{
            			fruits.setFresh(false);
            			System.out.println("Successfully Mark as a Stale");
            		}
					
				}
				
				break;
           
			}
			System.out.println("*************************************************************");
			
			//choise=menu();
			
			
			
		}

	}

}

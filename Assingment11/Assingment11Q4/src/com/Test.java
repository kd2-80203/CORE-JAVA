package com;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {

	/*
	 * 4. Use TreeSet to store all books in descending order of price. 
	 * Natural ordering for the Book should be isbn (do not change it). 
	 * Display them using iterator()
     * and descendingIterator().
	 * */
	
	public static void main(String[] args) 
	{
		BookComparator bc=new BookComparator();
		
		TreeSet<Book>library1=new TreeSet<>(bc);
		
		Book b1=new Book("101",500.00,"Ram",3000);
		Book b2=new Book("1",575,"Vinod",790);
		Book b3=new Book("31",650.00,"Dhanraj",200);
		Book b4=new Book("str",575,"Tanay",30);
		Book b5=new Book("3",400.00,"Shekhar",50);
		Book b6=new Book("90",300.00,"Pratik",80);
		Book b7=new Book("7",260.00,"Vinod",78);
		
		
		library1.add(b1);
		library1.add(b2);
		library1.add(b3);
		library1.add(b4);
		library1.add(b5);
		library1.add(b6);
		library1.add(b7);
		
System.out.println("-----------------------------------------------------------------------");
		
System.out.println("Sorted by price of book in Decending Order");
Iterator<Book>itr1=library1.descendingIterator();
		
		while(itr1.hasNext())
		{
			Book ele=itr1.next();
			System.out.println(ele);
		}
	}
	


}

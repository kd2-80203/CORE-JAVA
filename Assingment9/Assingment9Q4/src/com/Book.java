package com;

import java.util.Objects;
import java.util.Scanner;

/*4. Store book details in a library in a list -- ArrayList.
Book details: isbn(string), price(double), authorName(string), quantity(int)
Write a menu driven (do-while + switch-case) program to
1. Add new book in list.
2. Display all books in forward order.
3. Delete at book given index -- list.remove(index);
4. Check if book with given isbn is in list or not
5. Delete all books in list
6. Display number of books in list
7. Sort all books by price in desc order -- list.sort(); 
 * */
public class Book
{
   String isbn;
   double price;
   String authorName;
   int quantity;
   
   public Book()
   {
	   
   }

public Book(String isbn, double price, String authorName, int quantity) {
	super();
	this.isbn = isbn;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Override
public String toString() {
	return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity + "]";
}

public void accept()
{
  Scanner sc=new Scanner(System.in);
	
  System.out.println("Enter isbn no of Book");
  this.isbn= sc.next();
  System.out.println("Enter the Price Book");
  this.price=sc.nextDouble();
  System.out.println("Enter author name no of Author Name");
  this.authorName=sc.next();
  System.out.println("Enter the of books Quantity");
  this.quantity=sc.nextInt();
}


@Override
public boolean equals(Object obj) 
{
	boolean flage=false;
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (obj instanceof Book)
	{ 
		Book b1=(Book)obj;
		if(this.isbn==b1.getIsbn())
		{   
			
			flage= true;	
		}
	}
	
	return flage;
	}
   
}











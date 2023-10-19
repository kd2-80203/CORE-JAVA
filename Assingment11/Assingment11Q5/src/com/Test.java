package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	/*
	 * 5. Store Books in HashMap<> so that for given isbn, book can be searched in
	 * fastest possible time. Do we need to write equals() and hashCode() in Book
	 * class? Hint:
	 */

	public static void main(String[] args) {

		HashMap<String, Book> library = new HashMap<>();

		Book b1 = new Book("101", 500.00, "Ram", 3000);
		Book b2 = new Book("1", 575, "Vinod", 790);
		Book b3 = new Book("31", 650.00, "Dhanraj", 200);
		Book b4 = new Book("str", 550.00, "Tanay", 30);
		Book b5 = new Book("3", 400.00, "Shekhar", 50);
		Book b6 = new Book("90", 300.00, "Pratik", 80);
		Book b7 = new Book("7", 260.00, "Vinod", 78);

		library.put(b1.getIsbn(), b1);
		library.put(b2.getIsbn(), b2);
		library.put(b3.getIsbn(), b3);
		library.put(b4.getIsbn(), b4);
		library.put(b5.getIsbn(), b5);
		library.put(b6.getIsbn(), b6);
		library.put(b7.getIsbn(), b7);

		// SortedSet<Entry<String,Book>>r=library.entrySet();

		Set<String> keys = library.keySet();
		System.out.println("Keys: " + keys);

		Collection<Book> values = library.values();
		System.out.println("Values: " + values);

		System.out.println("--------------------------------------------------------------------");
		Set<Entry<String, Book>> entries = library.entrySet();
		for (Entry<String, Book> entry : entries) 
		{
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}

}

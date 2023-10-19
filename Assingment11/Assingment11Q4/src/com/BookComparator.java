package com;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) 
	{
		int dff=Double.compare(b1.getPrice(), b2.getPrice());
		
		return dff;
	}

}

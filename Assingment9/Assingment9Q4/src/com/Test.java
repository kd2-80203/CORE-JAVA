package com;

import java.util.Scanner;

public class Test {
	
	
	
	public static int menu()
	{
		
		int choise;
		Scanner sc=new Scanner(System.in);
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index -- list.remove(index)");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order -- l");
		choise=sc.nextInt();
		return choise;
	}

	public static void main(String[] args) {
		
		/*1. Add new book in list.
2. Display all books in forward order.
3. Delete at book given index -- list.remove(index);
4. Check if book with given isbn is in list or not
5. Delete all books in list
6. Display number of books in list
7. Sort all books by price in desc order -- l
		 * */

		int choise;
		while(0!=(choise=menu())
		{
			switch (choise) {
			case 1:
				
				break;
             
			case 2:
				
				break;
            
			case 3:
				
				break;
				
            case 4:
				
				break;
				
            case 5:
	
	            break;
	           
            case 6:
				
				break;
				
            case 7:
				
				break;
			default:
				break;
			}
		}
		
	}

}

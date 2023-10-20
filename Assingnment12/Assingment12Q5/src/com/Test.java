package com;

import java.util.Scanner;

public class Test {
/*5. In above assignment, create one more array of Double (constant values) 
 * where few elements are repeated. Input a key from user and check how many
 * times key is repeated in the array using appropriate lambda expression.
 * */
	
	public static <T> int countIf(T []arr,T key,Check<T>c)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(c.compare(arr[i], key))
			{
				count++;
			}
			
		}
		return count;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the key");
		Double key=sc.nextDouble();
		
		Double [] arr= {10.34,45.78,49.85,70.78,80.23,56.23};
		
		double cnt = countIf(arr, key, (x,y)->x.equals(y));
		System.out.println("Count = " + cnt);
	}

}









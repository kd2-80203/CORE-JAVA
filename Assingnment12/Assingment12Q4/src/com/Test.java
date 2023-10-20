package com;

public class Test {

/*4. Create a functional interface Check<T> with single abstract method boolean compare(T x, T y). 
 *   Create a static method in main class to test array elements static <T> int countIf(T[] arr,
 *   T key, Check<T> c). This method should return count of elements in the array for which
     given check is satisﬁed. The check will be given as lambda expression. 
     Example call to countIf() from main() will be as follows.
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
		
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
		

	}

}

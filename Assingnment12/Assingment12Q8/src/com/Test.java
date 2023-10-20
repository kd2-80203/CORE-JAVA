package com;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
//8. Create an IntStream to represent numbers from 1 to 10. 
//   Call various functions like sum(), summaryStatistics() and observe the output.
	
	
	public static void main(String[] args) 
	{
		IntStream strm1=IntStream.range(1, 10);
		int sum=strm1.sum();
		
		IntStream strm2=IntStream.range(1, 10);
		OptionalDouble avg=strm2.average();
		
		System.out.println("The sum is = "+sum);
		System.out.println("The  avg is = "+avg);
		
		IntStream strm3=IntStream.range(1, 10);
		IntSummaryStatistics obj =strm3.summaryStatistics();
		System.out.println(obj);
	}

}

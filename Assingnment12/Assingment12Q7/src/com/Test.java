package com;

import java.util.Random;
import java.util.stream.Stream;

public class Test {

//7. Write a program to calculate sum of 10 random integers using streams.
	public static void main(String[] args) {
		
		Random r=new Random();
		Stream<Integer>strm1=Stream.generate(()->r.nextInt(100)).limit(10);
		int sum=strm1.reduce(0,(x,y)->x+y);
		System.out.println("The sum of random 10 no is = "+sum);

	}

}

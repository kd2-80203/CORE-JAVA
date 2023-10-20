package com;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
//6. Calculate the factorial of the given number using stream operations.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no which factorial you want to calculate");
		int n=sc.nextInt();
		Stream<Integer> strm =Stream.iterate(1,x->x+1).limit(n);
		Integer fact=strm.reduce(1,(x,y)->x*y);
		System.out.println(fact);

	}

}

package com;

import java.util.Scanner;

public class Test {
	/*
	 * Write a static method calculate() in main class as follows. In main(), write
	 * a menu driven program that inputs two numbers from the user and calls
	 * calculate() method with appropriate lambda expression (in arg3) to perform
	 * addition, subtraction, multiplication and division operations.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first no");
		int n1 = sc.nextInt();
		System.out.println("Enter the second no");
		int n2 = sc.nextInt();

		int choise = 1;
		while (choise != 0) {
			System.out.println("0.Exit");
			System.out.println("1.Add");
			System.out.println("2.Substarction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Mod");
			choise = sc.nextInt();
			
			switch (choise) {
			case 1:
			{
				calculate(n1, n2, (x,y)->x+y);
			}
				break;

			case 2:
			{
				calculate(n1, n2, (x,y)->x-y);
			}
				break;
			case 3:
			{
				calculate(n1, n2, (x,y)->x*y);
			}
				break;
			case 4:
			{
				calculate(n1, n2, (x,y)->x/y);
			}
				break;
			case 5:
			{
				calculate(n1, n2, (x,y)->x%y);
			}
				break;
				
			default:
				break;
			}
		}
		

	}

	static void calculate(double num1, double num2, Arthematic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

}

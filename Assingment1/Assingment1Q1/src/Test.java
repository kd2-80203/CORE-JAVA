/*
 * Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14

public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		//using traditional for loop
		System.out.println("using Simple For loop");
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		// using for each
		System.out.println("Using For each");
		for(int element:arr) {
			System.out.println(element);
		}
		
		public static void main(String[] args) {		
		if(args.length == 2) {
		System.out.println(args[0]);
		System.out.println(args[1]);

		int num1 = Integer.valueOf(args[0]);
		int num2 = Integer.valueOf(args[1]);
		
		//System.out.println("Addition = "+(args[0]+args[1]));
		System.out.println("Addition = "+(num1+num2));
		}
		else
			System.out.println("Invalid No of Arguments...Please provide 2 arguments only");
	}
 * */


public class Test {

	public static void main(String[] args)   
	{                                     
		int x=Integer.valueOf(args[0]);
		//String []args takes all arguments as a string that's why we uses Wrapper class to convert	
		// string arguments into integer values
		System.out.println("The binary is = "+Integer.toBinaryString(x));  
		System.out.println("The hexadecimal is = "+Integer.toHexString(x));
		System.out.println("The Octal no is = "+Integer.toOctalString(x));
		
	}

}

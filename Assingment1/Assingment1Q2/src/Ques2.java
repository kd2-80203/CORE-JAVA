import java.util.Scanner;

/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
 * */
public class Ques2 {

	public static void main(String[] args)
	{
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the first no ");
		  double num1;
		  num1=sc.nextDouble();
		  System.out.println("Enter the second no ");
		  if(sc.hasNextDouble()&&!sc.hasNextInt())
		  {
		      double num2;
		      num2=sc.nextDouble();
		      System.out.println("The Avg of two no is = "+(num1+num2)/2);
		  }
		  else {
			  System.out.println("Pls Enter the vaild value1");
		  }
		  
		
	}

}

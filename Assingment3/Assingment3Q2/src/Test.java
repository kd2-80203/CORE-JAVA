import java.util.Scanner;

/*Q2. Copy the Point2D class , along with the package from previous assignment.
a) Create a class "TestPointArray1.java" in "tester" package for the following
b) Accept , how many no of points to plot from user.
c) Create suitable data structure
Hint : Point2D[] points=new Point2D[sc.nextInt()];
d) Prompt user for x & y co ordinates n store the data suitably
Hint : for loop
e) Supply Menu to user with various Options like following
1. Display details of a specific point
User i/p : index
O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
2) Display x, y co-ordinates of all points
Hint : for-each
3) User i/p : 2 indices for the points , validate the indices
Display distance between specified points (iff they are not located at the same position)
eg : sop("Enter index of strt point n end point");
validation : boundary condition (0<=index<length-1)
isEqual -- false --compute distance --display it.
4. Exit
 * */
public class Test {

	public void displayAllPoint(Point2D arr[])
	{
		int i=0;
		for(Point2D element:arr)
		{
			System.out.print("Point at "+i+" is :");
			element.display();
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Test test=new Test();
		
		System.out.println("Pls enter the no of points you want to enter");
		int n;
		n=sc.nextInt();
		Point2D arr[]=new Point2D[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value of X");
			int x;
			x=sc.nextInt();
			System.out.println("Enter the value of Y");
			int y;
			y=sc.nextInt();
			arr[i]=new Point2D(x,y);
			
		}
		
		int choise=1;
		while(choise!=4)
		{
			System.out.println("1-Display details of a specific point");
			System.out.println("2-Display x, y co-ordinates of all points");
			System.out.println("3-Display distance between specified points");
			System.out.println("4-EXIT");
			choise=sc.nextInt();
			
			switch(choise)
			{
			case 1:
				System.out.println("Enter the index value the length of array is :"+arr.length);
				int x;
				x=sc.nextInt();
				arr[x].display();
				
			  break;
			 
			case 2:
				test.displayAllPoint(arr);
			  break;
			
			case 3:
				System.out.println("The length of array is :"+arr.length);
				System.out.println("Enter the first line index value");
                int l1=sc.nextInt();
				System.out.println("Enter the sencond line index values");
                int l2=sc.nextInt();
				
                double dist= arr[l1].claculateDistance(arr[l2]);
                System.out.println("The distance is :"+dist);
                System.out.println();
             break;
             
			}
			
			
			
		}

	}

}

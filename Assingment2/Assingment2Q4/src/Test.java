import java.util.Scanner;

import com.app.geometry.Point2D;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Point2D p1=new Point2D(2,4);
		Point2D p2=new Point2D(6,9);
		
		p1.display();
		p2.display();
		
		System.out.println("The Distance betweent two points is = "+p1.claculateDistance(p2));
		
		System.out.println("Enter value for new line 1");
		int x,y;
		System.out.println("Enter value of X1");
		x=sc.nextInt();
		System.out.println("Enter value of y1");
		y=sc.nextInt();
		Point2D p11=new Point2D(x,y);
		System.out.println("Enter value for new line 1");
		System.out.println("Enter value of X2");
		x=sc.nextInt();
		System.out.println("Enter value of y2");
		y=sc.nextInt();
		Point2D p12=new Point2D(x,y);
		System.out.println("The Distance betweent two points is = "+p11.claculateDistance(p12));

		

	}

}

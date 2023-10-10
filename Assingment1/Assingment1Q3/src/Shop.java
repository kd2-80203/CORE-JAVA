import java.util.Scanner;

/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
 * */

public class Shop {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		int quantity=0;
		float price=0;
		double total=0;
		double totalbill=0;
		
		
		while(i!=0)
		{
			System.out.println("Enter your choise");
			System.out.println("Idli,Samosa,Dosa,Pohe,Upma,Laddu,GulabJamun,vada,kachori,roll");
			String choise;
			choise=sc.next();
		switch (choise) 
		{
		  case "Idli":
			  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=10;
			  total=quantity*price;
			
			 break;
			 
          case "Samosa":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=15;
			  total=quantity*price;
			
			 break;
			 
          case "Dosa":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=50;
			  total=quantity*price;
			
			 break;
			 
          case "Pohe":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=30;
			  total=quantity*price;
  			
 			 break;
			
          case "Upma":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=20;
			  total=quantity*price;
  			
 			 break;
 			 
          case "Laddu":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=15;
			  total=quantity*price;
  			
 			 break;
 			 
          case "GulabJamun":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=5;
			  total=quantity*price;
  			
 			 break; 
 			 
          case "vada":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=10;
			  total=quantity*price;
    			
  			 break; 
  			 
          case "kachori":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=15;
			  total=quantity*price;
    			
  			 break; 
          case "roll":
        	  System.out.println("Enter the quantity you want to bye");
			  quantity=sc.nextInt();
			  price=40;
			  total=quantity*price;
    			
  			 break; 
		  
		}
		totalbill=totalbill+total;
		System.out.println("Your total bill is : "+totalbill);
		System.out.println("Want to bye again 0-NO,1-YES");
		i=sc.nextInt();
		
	}
	}

}

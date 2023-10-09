import java.util.Scanner;

/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".
 * */
public class Customer {
	
	int accountNo;
	int balanceAtbegin;
	int totalItems;
	int creditLimit;
	
	public Customer(int accountNo, int balanceAtbegin, int totalItems, int creditLimit) {
		super();
		this.accountNo = accountNo;
		this.balanceAtbegin = balanceAtbegin;
		this.totalItems = totalItems;
		this.creditLimit = creditLimit;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalanceAtbegin() {
		return balanceAtbegin;
	}

	public void setBalanceAtbegin(int balanceAtbegin) {
		this.balanceAtbegin = balanceAtbegin;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
   public void acceptData()
   {
	   System.out.println("Enter account no : ");
	   int a;
	   Scanner sc = new Scanner(System.in);
	   a=sc.nextInt();
	   setAccountNo(a);
	   
	   System.out.println("Enter account Balance : ");
	   a=sc.nextInt();
	   setBalanceAtbegin(a);
	   
	   System.out.println("Enter Total item : ");
	   a=sc.nextInt();
	   setTotalItems(a);
	   
	   System.out.println("Enter credit limit: ");
	   a=sc.nextInt();
	   setCreditLimit(a);
	  	   
   }
	   
	 public void newBalance()
	 {
		 double newBalance;
		 newBalance=((balanceAtbegin+totalItems)-creditLimit);
		 /*isplay the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded"*/
		 if(newBalance>creditLimit)
		 {
			 System.out.println("Credit limit exceeded");
		 }
		 else {
			 System.out.println("Credit limit is less");
		 }
		 
		 System.out.println("The new Balance is = "+newBalance);
	 }
	   
	      
   }



import java.util.*;

/**Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 * */
 class Invoice 
{
	
	private String part_Number;
	private String part_Description;
	private int quantity ;
	private double price;
	
	public Invoice() 
	{
		this.quantity=0;
		this.price=0;
	}

	public Invoice(String part_Number, String part_Description, int quantity, double price) {
		super();
		
		this.part_Number = part_Number;
		this.part_Description = part_Description;
		if(quantity>0)
		{
		this.quantity = quantity;
		}
		else {
			this.quantity=0;
		}
		if(price>0)
		{
		this.price = price;
		}
		else {
			this.price=0;
		}
	}


	public String getPart_Number() {
		return part_Number;
	}

	public void setPart_Number(String part_Number) {
		this.part_Number = part_Number;
	}


	public String getPart_Description() {
		return part_Description;
	}

	public void setPart_Description(String part_Description) {
		this.part_Description = part_Description;
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		if(quantity>0)
			{
			this.quantity = quantity;
			}
		else {
			this.quantity=0;
		}
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		if(price>0)
		{
		 this.price=price;
		}
		else {
		this.price = 0;}
	}
	
	public double calculateBill()
	{
		double bill;
		bill=this.price*this.quantity;
		return bill;
	}

}

 public class invoiceTest
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Invoice invoice = new Invoice();
		System.out.println("Enter Part Number: ");
		String partNo=sc.next();
		
		System.out.println("Enter Part Description: ");
		String partDecr=sc.next();
		
		System.out.println("Enter Price: ");
		double price=sc.nextDouble();
		
		System.out.println("Enter Quantity: ");
		int quantity=sc.nextInt();
		
//		if(price<0)
//		{
//			price=0;12
//		}
//		
//		if(quantity<0)
//		{
//			quantity=0;
//		}
		invoice.setPart_Number(partNo);
		invoice.setPart_Description(partDecr);
		invoice.setPrice(price);
		invoice.setQuantity(quantity);
		
		double bill=invoice.calculateBill();
		System.out.println("The total bill is  = "+bill);
		
	}
	
}



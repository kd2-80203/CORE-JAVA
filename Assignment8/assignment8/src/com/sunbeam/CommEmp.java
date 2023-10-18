package com.sunbeam;
import java.util.*;

public class CommEmp extends Empoloyee  {
	private int commrate;
	private int grossSale;

	public CommEmp(String fname, String lname, double salary, int commrate, int grossSale) {
		super(fname, lname, salary);
		this.commrate = commrate;
		this.grossSale = grossSale;
	}

	public CommEmp() {
		super();
	}

	public int getCommrate() {
		return commrate;
	}

	public void setCommrate(int commrate) {
		this.commrate = commrate;
	}

	public int getGrosssale() {
		return grossSale;
	}

	public void setGrosssale(int grosssale) {
		this.grossSale = grosssale;
	}

	public void accept() {
		super.accept();
		System.out.println("Enter Commission Rate ");
		commrate = new Scanner(System.in).nextInt();
		System.out.println("Enter GrossSale ");
		this.grossSale = new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {

		return (super.toString() + "  Gross Sale = " + this.grossSale + "  Commission Rate  =" + this.commrate);
	}
	
	public double calculateTotalSalary()
	{
		return (super.getSalary()+this.commrate*this.grossSale);
	}

	

}

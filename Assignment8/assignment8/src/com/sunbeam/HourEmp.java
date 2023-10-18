package com.sunbeam;
import java.util.*;

public class HourEmp  extends Empoloyee{
	private int wage;
	private int hours;
	public HourEmp(String fname, String lname, double salary, int wage, int hours) {
		super(fname, lname, salary);
		this.wage = wage;
		this.hours = hours;
	}
	public HourEmp() {
		super();
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	public void accept()
	{
		super.accept();
		System.out.println("enter wages");
		this.wage=new Scanner(System.in).nextInt();
		System.out.println("Enter no of hours worked");
		this.hours=new Scanner(System.in).nextInt();
		
	}
	@Override
	public String toString() {
		
		return (super.toString()+"  Wages = "+this.wage+"  hours worked ="+this.hours);
	}
	public double calculateTotalSalary()
	{
		super.setSalary(0);
		return (this.wage*this.hours);
	}


}

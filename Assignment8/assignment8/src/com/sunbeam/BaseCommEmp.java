package com.sunbeam;
import java.util.*;

public class BaseCommEmp    extends Empoloyee{
	
	private  double incentives;

	public BaseCommEmp(String fname, String lname, double  salary , double incentives) {
		super(fname, lname, salary);
		this.incentives=incentives;
	}

	public  BaseCommEmp()
	{
		super();
	}

	public double getIncentives() {
		return incentives;
	}

	
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter Incentives");
		this.incentives=new Scanner(System.in).nextDouble();
	}
	@Override
	public String toString() {
	
		return (super.toString()+"   basic Salary = "+this.incentives);
	}
	
	public double calculateTotalSalary()
	{
		return (super.getSalary()+this.incentives);
	}

}

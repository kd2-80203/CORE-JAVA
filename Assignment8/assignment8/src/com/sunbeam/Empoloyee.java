package com.sunbeam;
import java.util.*;

 public class Empoloyee  {

		private String fname;
		private String lname;
		private double salary;

		public Empoloyee(String fname, String lname, double salary) {

			this.fname = fname;
			this.lname = lname;
			this.salary = salary;
		}

		public Empoloyee() {

		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public  double  getSalary() {
			return salary;
		}

		public void setSalary(double ssn) {
			this.salary= salary;
		}

		public void accept()
		{
			System.out.println("Enter first name");
			this.fname =new Scanner(System.in).next();
			System.out.println("Enter Last name");
			this.lname =new Scanner(System.in).next();
			System.out.println("Enter Salary ");
			this.salary =new Scanner(System.in).nextDouble();
		}
	

		@Override
		public String toString() {
			
			return ("Name = "+this.fname+" "+this.lname+" Basic Salary = "+this.salary);
		}
		
		public double calculateTotalSalary()
		{
			return this.salary;
		}
	

}

	


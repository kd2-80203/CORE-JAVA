package com;

public class Clerk implements Emp {
	/*
	 * In this class override getSal() method (salary). Do not override,
	 * calcIncentives() in Clerk class.
	 */
	private double salary;

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	public Clerk() {
		super();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {

		return this.salary;
	}

}

package com;

public class Manager implements Emp {

	private double basicSalary;
	private double dearanceAllowance;

	public Manager() {
		super();
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {

		// getSal() method (basicSalary +
		// * dearanceAllowance) as well as calcIncentives() method (20% of basicSalary).

		return this.basicSalary + this.dearanceAllowance;
	}

	@Override
	public double calcIncentives() {
		return 0.2 * this.basicSalary;
	}
}

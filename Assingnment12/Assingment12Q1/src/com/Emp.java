package com;

/*static double calcTotalIncome(Emp arr[]) that calculate total income (salary
	 * + incentives) of all employees in the given array.*/

public interface Emp {

	double getSal();

	default double calcIncentives() {

		return 0;
	}

	static double calcTotalIncome(Emp arr[]) {
		double totalIncome = 0;
		for (int i = 0; i < arr.length; i++) {
			totalIncome += arr[i].getSal() + arr[i].calcIncentives();

		}
		return totalIncome;
	}
}

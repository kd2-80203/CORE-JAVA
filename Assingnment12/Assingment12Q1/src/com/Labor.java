package com;

public class Labor implements Emp {

	private int hour;
	private double rate;

	public Labor() {
		super();
	}

	public Labor(int hour, double rate) {
		super();
		this.hour = hour;
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {

		return this.hour * this.rate;
	}

	@Override
	public double calcIncentives() {
		if (this.hour > 300)
			return 0.5 * this.hour * this.rate;
		return 0;
	}
	/*
	 * (with ﬁelds hours and rate) inherited from Emp interface. In this class
	 * override getSal() method (hours * rate) as well as calcIncentives() method
	 * (5% of salary if hours > 300, otherwise no incentives)
	 */

}

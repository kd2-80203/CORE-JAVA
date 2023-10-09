/*Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
 * */
import java.util.Scanner;
public class Car 
{
	double totalMiles;
	float CostGasolin;
	float avgMilePerGallon;
	float parkingFees;
	int TollsPerDay;
	
	Scanner sc = new Scanner(System.in);
	
	public Car(double totalMiles, float costGasolin, float avgMilePerGallon, float parkingFees, int tollsPerDay) {
		super();
		this.totalMiles = totalMiles;
		CostGasolin = costGasolin;
		this.avgMilePerGallon = avgMilePerGallon;
		this.parkingFees = parkingFees;
		TollsPerDay = tollsPerDay;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public double getTotalMiles() {
		return totalMiles;
	}

	public void setTotalMiles(double totalMiles) {
		this.totalMiles = totalMiles;
	}

	public float getCostGasolin() {
		return CostGasolin;
	}

	public void setCostGasolin(float costGasolin) {
		CostGasolin = costGasolin;
	}

	public float getAvgMilePerGallon() {
		return avgMilePerGallon;
	}

	public void setAvgMilePerGallon(float avgMilePerGallon) {
		this.avgMilePerGallon = avgMilePerGallon;
	}

	public float getParkingFees() {
		return parkingFees;
	}

	public void setParkingFees(float parkingFees) {
		this.parkingFees = parkingFees;
	}

	public int getTollsPerDay() {
		return TollsPerDay;
	}

	public void setTollsPerDay(int tollsPerDay) {
		TollsPerDay = tollsPerDay;
	}
	
	public void accept()
	{
		System.out.println("Enter the Total miles driven per day");
		totalMiles=sc.nextDouble();
		System.out.println("Enter the Cost per gallon of gasoline");
		CostGasolin=sc.nextFloat();
		System.out.println("Enter the Average miles per gallon");
		avgMilePerGallon=sc.nextFloat();
		System.out.println("Enter the Parking fees per day");
		parkingFees=sc.nextFloat();
		System.out.println("Enter the TollsPerDay");
		TollsPerDay=sc.nextInt();
	}
	
	public void dailyDrivingCost()
	{
		double totalGasolin=totalMiles/avgMilePerGallon;
		double totalCostGasolin=totalGasolin*CostGasolin;
		double totalParkingFees=parkingFees*TollsPerDay;
		
		double totalDrivingCost=totalCostGasolin+totalParkingFees;
		
		System.out.println("The total daily driving cost is : "+totalDrivingCost);
	}
	

}

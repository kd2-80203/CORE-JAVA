import java.util.Scanner;

/*Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 * */
class Employee
{
	String fName;
	String lName;
	double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String fNmae, String lName, double salary) {
		super();
		this.fName = fNmae;
		this.lName = lName;
		if(salary>0)
		{
		this.salary = salary;
		}
		else {
			this.salary=0;
		}
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fNmae) {
		this.fName = fNmae;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public double getSalaryMonthly() {
		return salary;
	}
	public double getSalaryYearly() {
		return salary*12;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
  	
}
public class EmployeeTest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee("Dhanraj","Mankar",60000);
		Employee e2=new Employee("yashraj","ghadage",78000);
		
		System.out.println("The name : "+e1.getfName()+" last name is :"+e1.getlName()+"salary is :"+e1.getSalaryMonthly());
		System.out.println();
		System.out.println("The name : "+e2.getfName()+" last name is :"+e2.getlName()+"salary is :"+e2.getSalaryMonthly());

		e1.setSalary(e1.getSalaryMonthly()*1.10);
		e2.setSalary(e2.getSalaryMonthly()*1.10);
		
		System.out.println("Salary After 10% increment");
		System.out.println("The name : "+e1.getfName()+" last name is :"+e1.getlName()+"salary is :"+e1.getSalaryMonthly());
		System.out.println();
		System.out.println("The name : "+e2.getfName()+" last name is :"+e2.getlName()+"salary is :"+e2.getSalaryMonthly());
		System.out.println();
		System.out.println("The Yearly salary for e1 is : "+e1.getSalaryYearly());
		System.out.println("The Yearly salary for e2 is : "+e2.getSalaryYearly());
		
}
}

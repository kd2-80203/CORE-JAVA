package com.sunbeam;

class Box<T extends Empoloyee>
{
	private T data;
	public void  setData(T data)
	{
		this.data=data;
		
	}
	public T getdata()
	{
		return this.data;
	}
}

public class program {
	
	public static void main(String []args )
	{
		Empoloyee e1= new Empoloyee();e1.accept();
		Box<Empoloyee> b1= new Box();
		b1.setData(e1);
		System.out.println(b1.getdata().calculateTotalSalary());
		
		//Base commission Employee
		BaseCommEmp e2= new BaseCommEmp();
		Box<BaseCommEmp>b2= new Box();
		e2.accept();
		b2.setData(e2);
		System.out.println(b2.getdata().calculateTotalSalary());
		
		
		
	}
	
	

}

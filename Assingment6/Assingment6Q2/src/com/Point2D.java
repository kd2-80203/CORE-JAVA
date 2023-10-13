package com;

public class Point2D {
	
	int pointx;
	int pointy;
	
	public Point2D() {
		// TODO Auto-generated constructor stub
	}


	public Point2D(int pointx, int pointy) {
		super();
		this.pointx = pointx;
		this.pointy = pointy;
	}


	public int getPointx() {
		return pointx;
	}


	public void setPointx(int pointx) {
		this.pointx = pointx;
	}


	public int getPointy() {
		return pointy;
	}


	public void setPointy(int pointy) {
		this.pointy = pointy;
	}
	
	public void display()
	{
		System.out.println("X = "+this.pointx);
		System.out.println("Y = "+this.pointy);
	}

	public boolean isEquale(Point2D point)
	{
	  if(this.pointx==point.getPointx()&&this.pointy==point.getPointy())
	  {
		  return true;
	  }
	  else {
		  return false;
	  }
	}
	
	public double claculateDistance(Point2D point)
	{
		if(!isEquale(point))
		{
		int x=point.getPointx()-this.pointx;
		int y=point.getPointy()-this.pointy;
		double dist;
		dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return dist;
		}
		else {
			System.out.println("The two points are at same location");
			return 0;
		}
	}

}
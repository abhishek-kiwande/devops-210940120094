package com.app.geometry;

public class Point2D {
	public int x;
	public int y;
	
	public Point2D(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	public String getDetails()
	{
		return "cordi X : "+this.x  +"  "+"cordi Y :"+this.y;
	}
	
	public boolean isEqual(Point2D p)
	{
		if(this.x==p.x && this.y==p.y)
			return true;
		else
			return false;
	}
	
	public double CalculateDistance(Point2D p)
	{
		return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
	}
	
}

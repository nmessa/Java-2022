//Circle.java
//Author: nmessa
//Date: 2022/9/20

class Circle {
	//Data member
	public double radius;
	
	//Constructor
	public Circle(double r)
	{
		radius = r;
	}
	
	//area method
	public double area( ) //area method
	{
		double a = Math.PI * radius * radius;
		return a;
	}
	
	//circumference method
	public double circumference( ) //circumference method
	{
		double c = 2 * Math.PI * radius;
		return c;
	}

}

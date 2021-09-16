package com.epsilon;

public class Rectangle implements Shape{

	double length,breadth;
	
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		return this.length * this.breadth;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(this.length+this.breadth);
	}

}

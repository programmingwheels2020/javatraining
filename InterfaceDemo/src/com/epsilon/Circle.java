package com.epsilon;

public class Circle implements Shape {

	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14*this.radius*this.radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*3.14*this.radius;
	}

}

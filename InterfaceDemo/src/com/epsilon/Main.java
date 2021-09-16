package com.epsilon;

public class Main {

	public double totalArea(Shape []shs) {
		double areasum=0;
		for (int i=0;i<shs.length;i++) {
			areasum+=shs[i].calculateArea();
		}
		return areasum;
	}
	public static void main(String []args) {
		Shape sh1 = new Rectangle(45.0,34.0);
		Shape sh2 = new Circle(34.0);
		
		double sharea1 = sh1.calculateArea();
		double sharea2 = sh2.calculateArea();
		
		
	}
}

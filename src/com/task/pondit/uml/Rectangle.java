package com.task.pondit.uml;

public class Rectangle extends Shape {
	
	
	private double side1;
	private double side2;
	
	
	public Rectangle() {}
	
	public Rectangle(Location location, double side1, double side2) {
		super(location);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [side1=" + side1 + ", side2=" + side2 + ", getSide1()=" + getSide1() + ", getSide2()="
				+ getSide2() + ", getLocation()=" + getLocation() ;
	}
	
	
	

}

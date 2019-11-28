package org.ipsd.k12.cs2019;

public class Point {

	private double x;
	private double y;
	
	Point(){
		this.x = 0.0;
		this.y = 0.0;
	}
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return this.y;
	}
	public void setY(double y ) {
		this.y = y;
	}
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double distance (double x, double y) {
		return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y,2));
	}
	public double distance (Point myPoint) {
		return Math.sqrt(Math.pow(this.x- getX(), 2) + Math.pow(this.y-getY(),2));
	}
	public double distance () {
		return Math.sqrt(Math.pow(this.x-0, 2) + Math.pow(this.y-0,2));
	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}
	

}

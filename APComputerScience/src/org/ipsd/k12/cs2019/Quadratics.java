package org.ipsd.k12.cs2019;

public class Quadratics {
//instance variable
	private double a;
	private double b;
	private double c;
//constructors	
	public Quadratics(double a, double b, double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Quadratics () {
		this(1,0,0);
	}
	
//class methods
	
	/*
	 * Create a method isonQuadratic(Point pt) that brings in a coordinate point object and returns true or false depending 
	 * if the coordinate point is a solution to the quadratic equation(On the graph)
	 * 
	 */
public boolean isOnQuadratic ( Point pt) {
	
// ax^2 + bx + c = y
	if ( (this.a * Math.pow(pt.getX(), 2) + this.b * pt.getX()  + this.c) == pt.getY()) {
		return true;
	}
	else {
		return false;
	}
}
/*
 * Create a method getVertex() that returns the CoordinatePoint of the vertex of the quadratic object.  
 * (Hint: Construct a NEW coordinate point with the vertex’s x and y)
 */
public Point getVertex() {

// x = -b/2a
// y = ax^2 + bx + c
	double x = -this.b/(2*this.a);
	double y = this.a * Math.pow(x,2) + this.b*x + this.c;
	
	Point p1 = new Point (x,y);
	return p1;

}

/*
 * Create a method x-intercepts() that returns a string stating the 2 x-values of the x-intercepts.  
 * Or if there is no x-intercepts, return “no x-intercepts.”
 */
public String xIntercepts() {
//		
	String result = "";
	
	if ( a == 0) {
		result = "No x intercepts";
	}
	else {
		
		double x1 = (- this.b + Math.sqrt(Math.pow(this.b,2) - (4 * this.a * this.c))) / (2 * this.a);
		double x2 = (- this.b - Math.sqrt(Math.pow(this.b,2) - (4 * this.a * this.c))) / (2 * this.a);
		result = "(" + x1 + "," + "0" + ")" + "," + "(" + x2 + "," + "0" + ")";
	}
	return result;
}
public String toString() {
	
	return "y =" + this.a + "x^2" + this.b + "x + " +  this.c ;
}
/*
 * Also create a toString() to print out the objects instance field (attributes)
 */



//getter and setters
public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public double getC() {
	return c;
}
public void setC(double c) {
	this.c = c;
}


public static void main(String [] args) {
	Quadratics q1 = new Quadratics (2 ,-5, 2);
	System.out.println(q1);
	System.out.println(q1.getVertex());
	Point p1 = new Point(0.5,0);
	System.out.println("Is" +  p1 + "on the quadratic " + q1 + "? " + q1.isOnQuadratic(p1) );
	System.out.println( "x intercepts of quadratic " + q1 + " is " + q1.xIntercepts());
	
}

}

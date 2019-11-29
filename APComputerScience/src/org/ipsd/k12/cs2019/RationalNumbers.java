package org.ipsd.k12.cs2019;
public class RationalNumbers
{
	private int myNumerator;
	private int myDenominator;

	//instance fields are myNumerator and myDenominator
	//parameterized constructor
	//initilize the instance variables
	public RationalNumbers(int num, int denom){
		
		myNumerator = num;
		myDenominator = denom;
	}
	
	//default constructor creates the fraction 1/1
	public RationalNumbers(){
		this (1,1);
	}
		
	//Create two accessor methods to access myNumerator and myDenominator
	
	public int getmyNumerator() {
		return myNumerator;
	}
	public int getmyDenominator() {
		return myDenominator;
	}
	//Create two mutator methods to set myNumerator and myDenominator
	
	public void setmyNumerator(int num) {
		myNumerator = num;
		
	}
	public void setmyDenominator(int denom) {
		myDenominator = denom;
	}
	//toString displays rational number as a fraction
	public String toString(){
		return myNumerator + "/" + myDenominator;
	}
	
	//returns a NEW rational number that is the reciprocal of the object(implicit parameter)
	public RationalNumbers getReciprocal() {
		RationalNumbers result = null;
        
		result = new RationalNumbers(myDenominator, myNumerator);
		
	    return result;
	}
	
	//returns a NEW rational number that multiplies 
	//the rational number parameter, r, with the implicit rational number object.
	public RationalNumbers multiply(RationalNumbers r){
       
		RationalNumbers result = null;
		
		int newNumerator = myNumerator * r.getmyNumerator();
		int newDenominator = myDenominator * r.getmyDenominator();
		result = new RationalNumbers (newNumerator, newDenominator);
		
		return result;
		
	}
	
	//divides the RationalNumber object by another RationalNumber r
	//Use the methods this.multiply(r) and this.reciprocal() to make efficient code
	public RationalNumbers divide(RationalNumbers r){

		RationalNumbers result = null;
		
		int newNumerator = myNumerator * r.getmyDenominator();
		int newDenominator = myDenominator * r.getmyNumerator();
		result = new RationalNumbers (newNumerator, newDenominator);
		
		return result;
    
	}
	
	//adds the RationalNumber object with another RationalNumber r
	//use an example like 2/3 + 3/4 to see how to get common denominators
	public RationalNumbers add(RationalNumbers r){

		RationalNumbers result = null;
		
		int newNumerator = (myNumerator * r.getmyDenominator() ) + (myDenominator * r.getmyNumerator());
		int newDenominator = myDenominator * r.getmyDenominator();
		result = new RationalNumbers (newNumerator, newDenominator);
		
		return result;
	}
	
	//subtract the RationalNumber object with another RationalNumber r
	public RationalNumbers subtract(RationalNumbers r){

		RationalNumbers result = null;
		
		int newNumerator = (myNumerator * r.getmyDenominator() ) - (myDenominator * r.getmyNumerator());
		int newDenominator = myDenominator * r.getmyDenominator();
		result = new RationalNumbers (newNumerator, newDenominator);
		
		return result;
	}
	
	//Challenge Method:
	//a method used to reduce all fractions
	//should be called at the end of all public methods
	//private so only the rational number class has access
	//needs to use loops, mod, and if statements
	private void reduce(){
				
	}
	
	public static void main (String args []) {
		
		RationalNumbers r1 = new RationalNumbers (4,5);		
		RationalNumbers r = new RationalNumbers(6,2);
		System.out.println("r1 : " + r1);
		System.out.println ("r : " + r);
		
		//
		//System.out.println(new RationalNumbers(2,3).add(new RationalNumbers(5,7)));
		//
		
		RationalNumbers result = r1.add(r);
		System.out.println( r1 + " + " + r + " = " + result);
		
	    result = r1.subtract(r);
		System.out.println(r1 + " - " + r + " = " + result);
		
	    result = r1.multiply(r);
		System.out.println( r1 + " * " + r + " = " + result);
		
	    result = r1.divide(r);
		System.out.println(r1 + " / " + r + " = " + result);
		
		result = r.add(r1);
		System.out.println( r1 + " + " + r + " = " + result);
		
	    result = r1.getReciprocal();
		System.out.println( r1 + " --> " + result);
		
		//r1.add(r);
	
		System.out.println("After addInPlace : " + r1);		
		
		
	
		
		
	}
}

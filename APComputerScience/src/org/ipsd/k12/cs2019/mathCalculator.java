package org.ipsd.k12.cs2019;

public class mathCalculator {
//Instance variables
//Constructor
	//Always create constuctor with all private variables as parameters
	//Create other constructors to call the base constructor with default values
//getter/setter methods
// class methods
	
    private int num1;                           
	private int num2;
		
 // public mathCalculator( int num1, int num2) {
//	  
//	  this.num1 = num1;
//	  this.num2 = num2;		  
//  }
  
  public mathCalculator ( int num1) {
	  this(num1,2);
  }
	
	public int getSum() {
		return num1 + num2;
	}
	public int getDifference() {
		return num1 - num2;
	}
	public int getProduct() {
		return num1 * num2;
	}
	public int getQuotient() {
		return num1/num2;
	}

	//
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public mathCalculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
}



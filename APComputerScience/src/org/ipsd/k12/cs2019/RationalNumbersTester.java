package org.ipsd.k12.cs2019;
public class RationalNumbersTester {
public static void main (String args []) {
		
		RationalNumbers r1 = new RationalNumbers (5,10);		
		RationalNumbers r = new RationalNumbers(6,2);
		RationalNumbers result;
		
		System.out.println("r1 : " + r1);		
		System.out.println("r : " + r);
	    
		result = r1.getReciprocal();
		System.out.println( r1 + " --> " + result);
		
		result = r1.add(r);
		System.out.println( r1 + " + " + r + " = " + result);
		
	    result = r1.subtract(r);
		System.out.println(r1 + " - " + r + " = " + result);
		
	    result = r1.multiply(r);
		System.out.println( r1 + " * " + r + " = " + result);
		
	    result = r1.divide(r);
		System.out.println(r1 + " / " + r + " = " + result);
				
	}
}

package org.ipsd.k12.cs2019;

public class Integerclass {

	public static void main (String [] args) {
	Integer i = new Integer(30);
	Integer i2 = new Integer ("25");
	Integer i3 = Integer.valueOf(45);
	
	int x = i.intValue();
		System.out.println(x);	
		
		Double v = new Double (30.0);
		System.out.println (v.doubleValue());
	//		
	double[] myList = new double[10];
	myList[0] = 30.1;

	double [] myList1 = { 1.0, 2.0 ,3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
	for (int x1 = 0; x1 < myList1.length; x1++) {
        System.out.println( myList1[x1] + " ");
     }
	
	for ( double x1 : myList1) {
		System.out.println(x1);
	}

	} //main
} //class
	

package org.ipsd.k12.cs2019;

public class mathCalculatorTester {

	public static void main(String[] args) {
		
	//
		mathCalculator obj1 = new mathCalculator (5, 4);         
		System.out.println ( "(" + obj1.getNum1()  + "," +  obj1.getNum2() + ")" + " obj 1 \n\t Sum = " + obj1.getSum()  +  "\n\t Dif = " + obj1.getDifference() + "\n\t Product = " + obj1.getProduct() + "\n\t Quotient = " + obj1.getQuotient());
	 obj1.setNum1(6);
	 obj1.setNum2(7);
	 System.out.println ( "(" + obj1.getNum1()  + "," +  obj1.getNum2() + ")" + " obj 1 \n\t Sum = " + obj1.getSum()  +  "\n\t Dif = " + obj1.getDifference() + "\n\t Product = " + obj1.getProduct() + "\n\t Quotient = " + obj1.getQuotient());
		//
		
		mathCalculator obj2 = new mathCalculator (30, 10);        
		System.out.println ( "(" + obj2.getNum1()  + "," +  obj2.getNum2() + ")" + "\n obj 2\n\t Sum = " + obj2.getSum()  +  "\n\t Dif = " + obj2.getDifference() + "\n\t Product = " + obj2.getProduct() + "\n\t Quotient = " + obj2.getQuotient());
	//
		mathCalculator obj3 = new mathCalculator (50);
		System.out.println ( "(" + obj3.getNum1()  + "," +  obj3.getNum2() + ")"+ "\n obj 3\n\t Sum = " + obj3.getSum()  +  "\n\t Dif = " + obj3.getDifference() + "\n\t Product = " + obj3.getProduct() + "\n\t Quotient = " + obj3.getQuotient());
		
	}

}

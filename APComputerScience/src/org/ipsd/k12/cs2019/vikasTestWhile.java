package org.ipsd.k12.cs2019;

public class vikasTestWhile {

	public static void main(String[] args)
	{ 
		 //prints even numbers
		 System.out.println("Print even numbers:");
		 int x = 0;
		 while ( x <= 10) {
			 System.out.println(x);
			 x = x+2;
		 }

		 //prints odd numbers
		 System.out.println("Print odd numbers:");
		  x = 1;
		 while ( x <= 10) {
			 System.out.println(x);
			 x = x+2;
		 }
		 //prints 0,1,2,3,4
		 System.out.println("Print number sequence:");
		 x = 0;
		 while ( x <= 10) {
			 System.out.println(x);
			 x = x+1;
		 }

		 //prints ONLY even numbers
		 System.out.println("Print ONLY even number:");
		 x = 0;
		 
		 while (x <= 10) {
			 if (x % 2 == 0) {
				 System.out.println (x); 
			 }
			 x = x + 1;
		 }
		 //prints a number even or odd
		 
		 x = 0;
		 while (x <= 10) {
			 if (x % 2 == 0) {
				 System.out.println (x  +  " is even ");	 
			 }
			 else {
				 System.out.println (x  +  " is odd ");
			 }
			 x = x + 1;
		 }

		 //Print multiplication table
		 
		 x = 1; //initialization
		 while (x<=5) { // test expression
			 System.out.println ("Multiplication table for" + x);
			 
			 int y = 1;
			 while ( y <= 10) {
				 System.out.println( x + "*" + y + "=" + (x*y));
				 y = y + 1;
			 }

			 x= x+1; //update/increment
		 }
		 
	} //main
} //class

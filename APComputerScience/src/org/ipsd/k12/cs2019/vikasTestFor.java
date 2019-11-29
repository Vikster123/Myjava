package org.ipsd.k12.cs2019;

public class vikasTestFor {

	public static void main(String[] args)
	{ 
		 //prints even numbers
		 System.out.println("Print even numbers:");
		 for ( int x = 0; x <= 10; x += 2) {
			 System.out.println (x);
		 }
		 
		 //prints odd numbers
		 System.out.println("Print odd numbers:");
		 for ( int x = 1; x <= 10; x += 2) {
			 System.out.println (x);
		 }
		 
		 //prints 0,1,2,3,4
		 System.out.println("Print number sequence:");
		 for ( int x = 0; x <= 10; x += 1)  {
			 System.out.println(x);
		 }
		 
		 //prints ONLY even numbers
		 System.out.println("Print ONLY even number:");
		 for ( int x = 0; x <= 10; x += 1) {
			 if (x % 2 == 0) {
				 System.out.println(x);
			 }
		 }
		 
		 //prints a number even or odd
		 System.out.println("Print a number is even or odd");
		 for (int x = 0; x <= 10; x += 1) {
			 if (x % 2 == 0) {
				 System.out.println (x + " --> even");
			 }
			 else {
				 System.out.println (x + " ==> odd");
			 }
		 }
		 //
		 for ( int x = 1; x <= 20; x += 1) {
			 System.out.println ("Multiplication table for" + x);
			 for ( int y = 1; y <= 10; y += 1) {
				 System.out.println( x + "*" + y + "=" + (x*y));
			 }
			 System.out.println ("Additional table for" + x);
			 for ( int z = 1; z <= 10; z += 1) {
				 System.out.println( x + "+" + z + "=" + (x+z));
			 }
			 
		 }
		 //
		 int x = 0;
		 for ( int i = 1; i <= 5; i++) {
			 x = 0;
			 for ( int j = 1; j <= 5; j++) {
				   x += i; 
					System.out.println (""+ i +  "*"  + j + "=" + (i*j) );
				}
			 System.out.println("");
			
		 }
			 
			
		
	
	
	
	
	
	}
	 
} 
 
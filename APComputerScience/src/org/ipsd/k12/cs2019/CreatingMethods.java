package org.ipsd.k12.cs2019;

//In this class, we will learn how to create our own methods
/*
 * Author		Date		Description
 * Vikas Reddy	9/9/2019	CreateingMethods
 * 
 */

public class CreatingMethods 
{
	//the main method will be used to TEST all of the methods we create
	public static void main(String[] args)
	{ 
		//again, don't worry about any of this code.  Just run the program to see if it works.
				boolean addTwoNumbersMethod = CreatingMethods.addTwoNumbers(6, 16) == 22;
				boolean findRemainderMethod = CreatingMethods.findRemainder(20, 6) == 2;
				boolean findAverageMethod = CreatingMethods.findAverage(5, 6) == 5.5;
				boolean findDistanceFromZeroMethod = CreatingMethods.findDistanceFromZero(5, -12) == 13.0;
				boolean findMidPointMethod = CreatingMethods.findMidpoint(-5,  8) == 1.5;
				boolean sayHelloMethod = CreatingMethods.sayHello("Ruth Bader Ginsburg").equals("Hello, Ruth Bader Ginsburg!");
				boolean divideTwoNumbersMethod = CreatingMethods.divideTwoNumbers(25, 8).equals("25 divided by 8 is 3, with a remainder of 1");
				
				if(addTwoNumbersMethod && findRemainderMethod && findAverageMethod 
						&& findDistanceFromZeroMethod && findMidPointMethod 
						&& sayHelloMethod && divideTwoNumbersMethod)
				{
					System.out.println("Nice work, all your methods work perfectly!");
				}
				else
				{
					if(!addTwoNumbersMethod)
						System.out.println("the addTwoNumbers() method needs to be fixed.");
					if(!findRemainderMethod)
						System.out.println("the findRemainder() method needs to be fixed.");
					if(!findAverageMethod)
						System.out.println("the findAverage() method needs to be fixed.");
					if(!findDistanceFromZeroMethod)
						System.out.println("the findDistanceFromZero() method needs to be fixed.");
					if(!findMidPointMethod)
						System.out.println("the findMidPoint() method needs to be fixed.");
					if(!sayHelloMethod)
						System.out.println("the sayHello() method needs to be fixed.");
					if(!divideTwoNumbersMethod)
						System.out.println("the divideTwoNumbers() method needs to be fixed.");
				}
			}

		
	
	
	//this method will add the parameters a and b and return the result
	public static int addTwoNumbers(int a, int b)
	{
		int result = a + b;
		return result;
	}
	
	//this number will return the remainder when dividend is divided by divisor
	public static int findRemainder(int dividend, int divisor)
	{
		int result = dividend % divisor;
		return result;
	}
	
	//this number will find the average of the two int parameters
	public static double findAverage(int a, int b)
	{
		double result = (a + b) / 2.0;
		return result;
	}
	
	//this method will find the distance of the point (x1, y1) from zero 
	//you may need to wait until tomorrow to complete this method
	public static double findDistanceFromZero(int x1, int y1)
	{
		double result = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		return result;
	}
	
	//this method will calculate the midpoint between x1 and x2
	public static double findMidpoint(int x1, int x2)
	{
		double result = (x1 + x2) / 2.0;
		return result;
	}
	
	//this method will return the String "hello, ______!", where the blank is the input parameter
	public static String sayHello(String yourName)
	{
		String result = "Hello, " + yourName + "!";
		return result;
	}
	
	//this method will divide the dividend by the divisor,
	//and will output the answer in a String:
	//example: if 26 and 5 were inputed, it would read, 
	//"26 divided by 5 is 5, with a remainder of 1"
	public static String divideTwoNumbers(int a, int b)
	{
		String result = a + " divided by " + b + " is " + (a / b) + ", with a remainder of " + (a % b );
		return result;
	}
	
	public static String changeToXoXo (String str) {
		
		int x = str.length() - 4;
		String y = str.substring(0, x);
		String result = y + "XoXo";
		return result;
		
	}
	
}



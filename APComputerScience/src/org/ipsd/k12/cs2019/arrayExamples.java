package org.ipsd.k12.cs2019;

public class arrayExamples {

	public static void main(String[] args) {
		
		/* int [] grades = new int [2];
		
		grades [0] = 87;
		grades [1] = 90;
		*/
		
		int[] grades = {90,87,70,430,234};
		System.out.println ("lenght of grades =" + grades.length);
		
		for ( int i = 0; i < grades.length; i++ ) {
			System.out.println ( "grade [" + i + "] = " + grades[i]);
		}

		String[] names = {"Vikas","Vindhya","Sree"};
		for(int i = 0; i< names.length;i++) {
			System.out.println("Name is : " + names[i]);
		}
		for(String name : names) {
			System.out.println("for each Name is : " + name);
		}
System.out.println(" Array Size = " + grades.length );
		/*
		int[][] result = new int [2][5];
		
	        result[0][0] = 20;
	        result[0][1] = 70;
	        result[0][2] = 20;
	        result[0][3] = 30;
	        result[0][4] = 50;
	      */
		
	    int [][] result = {
	    		{20,70,20,77,80}
	    		,{80,90,23,54,234}
	    		,{43,234,34,43,423}
	    		,{76,54,45,45,23}
	    }   ;
	    
		System.out.println("Two dimentional array length[x] = " + result.length);
		System.out.println("Two dimentional array length[y] = " + result[0].length);
		
		for (int i = 0; i < result.length; i++ ) {
			for ( int j = 0; j < result[0].length; j++) {
				System.out.println ( "grade [" + i + "][" + j + "] =" + result[i][j]);
			}
		}
	
	
	
	}
}

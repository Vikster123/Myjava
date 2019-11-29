package org.ipsd.k12.cs2019;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList <Integer> myList = new ArrayList <Integer>(5);
		myList.add(57);
		myList.add(77);
		myList.add(37);
		myList.add(88);
		myList.add(97);

		for (Integer x : myList) 
			System.out.println(x);

		System.out.println("size = " + myList.size());
		myList.remove(1);
		
		for (Integer x : myList) 
			System.out.println(x);
		System.out.println("size = " + myList.size());
	
		
		
		ArrayList <Integer> myList1 = new ArrayList <Integer>(5);
		myList.add(57);
		myList.add(77);
		myList.add(37);
		myList.add(88);
		myList.add(97);
		
	myList.add(34);
		
	}

}

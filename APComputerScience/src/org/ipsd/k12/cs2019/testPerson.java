package org.ipsd.k12.cs2019;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Vikas","Reddy",30);
		System.out.println("Before change " + p1.getFirstName() + " " + p1.getLastName() + " " + p1.getBalance());
		
		//p1.setFirstName("Vindha");
		p1.setBalance(20);
		System.out.println("After change " + p1.getFirstName() + " " + p1.getLastName() + " " + p1.getBalance());

		Person p2 = new Person("Daniel","Eipe",110);
		System.out.println(p2.getFirstName() + " " + p2.getLastName() + " " + p2.getBalance());
		
	}

}

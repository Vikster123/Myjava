package org.ipsd.k12.cs2019;

public class Person {
//create all the variables
	private String firstName;
	private String lastName;
	private int balance;
//create a constructor
	public Person(String firstName, String lastName, int balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
//create setter/getter ( modfiers)
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

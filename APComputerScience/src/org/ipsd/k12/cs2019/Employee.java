package org.ipsd.k12.cs2019;

public class Employee {     
//instance field
	private String lname;
	private String fname;
	private String address;
	private double salary;
	private int bonus;
//constructor	
	public Employee (String lname, String fname, String address, double salary, int bonus) {
		this.lname = lname;
		this.fname = fname;
		this.address = address;
		this.salary = salary;
		this.bonus = bonus;
		}
	public Employee() {
		this(null, null, null, 0.0, 0);
	}

//getter/setter methods
public String getLname() {
	return lname;
	}
public void setLname(String lname) {
	this.lname = lname;
	}
public String getFname() {
	return fname;
	}
public void setFname(String fname) {
	this.fname = fname;
	}
public String getAddress() {
	return address;
	}
public void setAddress(String address) {
	this.address = address;
	}
public double getSalary() {
	return salary;
	}
public void setSalary(Double salary) {
	this.salary = salary;
	}
public int getBonus() {
	return bonus;
	}
public void setBonus(int bonus) {
	this.bonus = bonus;
	}
//class methods	
public String toString() {
	return "Employee First Name:" + this.fname + "\n" + "Employee Last Name:" +  this.lname + "\n" + "Employee Address:" + this.address + "\n" + "Employee Salary:" + this.salary + "\n" + "Employee Bonus:" + this.bonus + "\n";
	}

public void salaryIncrement() {
	 this.salary = (this.salary * 0.1) + this.salary;
	}

// Main method


} // end class



	




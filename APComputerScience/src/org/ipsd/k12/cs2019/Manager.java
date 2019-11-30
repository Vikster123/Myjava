package org.ipsd.k12.cs2019;

public class Manager extends Employee {
//instance fields
//constructors
//getter/setter
//class methods	
	private int reportingEmployees;
	
	public Manager (String lname, String fname, String address, double salary, int bonus, int reportingEmployees) {
		super(lname, fname, address, salary, bonus);
		this.reportingEmployees = reportingEmployees;
		
		}
	public Manager() {
	
		this(null, null, null, 0.0, 0, 0);
	}
	public int getReportingEmployees() {
		return reportingEmployees;
	}
	public void setReportingEmployees(int reportingEmployees) {
		this.reportingEmployees = reportingEmployees;
	}
	
	//public void salaryIncrement() {
		//setSalary (getSalary() * 0.2 + getSalary());
		
		//}
	
	public String toString() {
		//return "xxxx";
		return super.toString() + "Number of reporting employees:" +  this.reportingEmployees;
		}
	
	public static void main (String args []) {
		Employee e1 = new Employee ("Reddy", "Vikas", "824 Lamont Ct", 200000.0, 10000);
		System.out.println(e1);
		e1.salaryIncrement();
		System.out.println(e1);
		
		Manager m1 = new Manager ("Trump", "Donald", "1600 Pennsylvania Ave", 400000.0, 50000, 23);
		System.out.println(m1);
		m1.salaryIncrement();
		System.out.println(m1);
		} // end main
}

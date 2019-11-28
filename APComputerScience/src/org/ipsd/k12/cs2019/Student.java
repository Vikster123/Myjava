package org.ipsd.k12.cs2019;

public class Student {
//
	private String idNum;
	private String name;
	private int grade;
	private double gPA;
//	
	public Student (String name, double gPA, int grade, String idNum) {
		
		this.name = name;
		this.gPA = gPA;
		this.grade = grade;
		this.idNum = idNum;
	}
	public Student(String Name, double GPA) {
		this(Name, GPA,0,null);
	}
	public Student () {
		this(null, 0.0, 0, null);
	}
//		


	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getgPA() {
		return gPA;
	}
	public void setgPA(double gPA) {
		this.gPA = gPA;
	}
	//
	public void advance() {
		 this.advance(1);
	}
	public void advance(int x) {
		this.grade += x;
	}
	
	public String toString() {
		
		return "Name is " + this.name + "\n" + "Grade is " + this.grade + "\n" + "ID Num is " + this.idNum + "\n" + "GPA is " + this.gPA;
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student ("Vikas", 4.0, 11, "2006396");
		
		System.out.println(s1);
		s1.setName("Vindhya");
		s1.advance(); 
		System.out.println(s1.toString());
		s1.advance(4); 
		System.out.println(s1.toString());
		
	}
	
}

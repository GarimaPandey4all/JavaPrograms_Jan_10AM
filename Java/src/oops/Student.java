package com.brainmentors.java.oops;

public class Student {
	
	//class variables, instance variables, data members
	// private member variables: Data Security or Data Hiding
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	
	
	// r, n, c, p, f = local variables
	public void takeInput(int r, String n, String p, String c, double f) {
		
//		instance variable = local variable
		rollno = r;
		name = n;
		phone = p;
		course = c;
		fees = f;
	}

	public void print()
	{
		System.out.println("Roll no is: "+this.rollno);
		System.out.println("Name is: "+name);
		System.out.println("Phone is: "+phone);
		System.out.println("Course is: "+course);
		System.out.println("Fees is: "+fees);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(); // new - is used to allocate memory at runtime
		ram.takeInput(1001, "Ram Kumar", "812364689", "MCA", 10000);
		ram.print();
		
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
		
//		ram.rollno = 1001;
//		ram.name = "Ram Kumar";
//		ram.phone = "9326498693";
//		ram.course = "MCA";
//		ram.fees = 10000;
		
		//System.out.println("*************************************************");
		
		//ram.print();
		
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
	}

}

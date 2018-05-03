package com.staff.gc;
/* 
* OOP : An approach to programming that 
*  breaks a programming problem 
*  into objects that interact with each other
*/

// if we do not write an access modifier for our class that means it's package private
public class Staff {
	/*
	 * 2 reasons to declare private a. No need for other classes to know about these
	 * fields ex. hourlyRate only needed in Staff class other classes don't use it
	 * at all this hides the field from other classes ENCAPSULATION : this enables a
	 * class to hide data and behavior from other classes also makes it easier to
	 * make changes to our code later without affecting other classes b. We don't
	 * want other classes to freely modify them, helps prevent fields from being
	 * corrupted
	 * 
	 * 
	 */

	// instance variables
	private String nameOfStaff;
	private final int hourlyRate = 30; // this is a constant
	private int hoursWorked;
	
	// Constructor is commonly used to initialize fields in the class
	// Main feature is that it is the first block of code that is called whenever we create an object
	// Does not return a value, but we don't have to use void
	
	public Staff(String name) {
		nameOfStaff = name;
		System.out.println("\n" + nameOfStaff);
		System.out.println("____________________");
		
	}
	public Staff(String firstName, String lastName) {
		nameOfStaff = firstName + " " + lastName;
		System.out.println("\n" + nameOfStaff);
		System.out.println("____________________");
		
	}
	

	// getters and setters give us greater control over the rights of what other 
	// classes when accessing these private fields
	public int getHoursWorked() {
		return hoursWorked;
	}



	// example demonstrates how we can use the setter methods to control 
	// values that can be assigned to our private field 
	// 
	public void setHoursWorked(int hours) {
		if (hours > 0) {
			hoursWorked = hours;
		} else {
			System.out.println("Error: Hours worked can't be less than 0");
			System.out.println("Error: Hours worked has not been updated...");
		}
		
		
	}

	// simple method to get started -- start here 
	public void printMessage() {
		System.out.println("Calculating pay...");
	}

	public int calculatePay() {
		printMessage();
		int staffPay = hoursWorked * hourlyRate; // local variable

		if (hoursWorked > 0) {
			return staffPay;
		}
		return -1;
	}

	// overloaded method example
	public int calculatePay(int bonus, int allowance) {
		printMessage();
		if (hoursWorked > 0) {
			return hoursWorked * hourlyRate + bonus + allowance;
		}
		return 0;
	}

}

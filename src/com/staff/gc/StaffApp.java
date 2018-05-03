package com.staff.gc;

public class StaffApp {

	public static void main(String[] args) {
		Staff staff1 = new Staff("John");
		staff1.setHoursWorked(100);
		int pay = staff1.calculatePay(1000, 400);
		System.out.println("Pay = " + pay);

		Staff staff2 = new Staff("Jane", "Lee");
		staff2.setHoursWorked(46); // also test negative numbers to show how the error handling works
		pay = staff2.calculatePay();
		System.out.println("Pay = " + pay);
	}

}

package com.cdac.polymorp;

public class AadharUpdate {

	public static void personDetails(int id, long phoneNumber) {
		System.out.println("id " + id + "   phone number " + phoneNumber);
	}

	public static void personDetails(long phoneNumber, int id, String name) {
		System.out.println("id-> " + id + "   phone number-> " + phoneNumber + "..  name  " + name);
	}
	
	public void myClass() {
		System.out.println("this is aadhar update class method");
	}

	public static void main(String[] args) {
		AadharUpdate au = new AadharUpdate();
		au.personDetails(101, 707070707070l);
		au.personDetails(707070707070l, 101, "Akash");

	}
}

package com.cdac.polymorp;

public class Bank extends AadharUpdate {

	@Override
	public void myClass() {
		System.out.println("this is Bank Class method");
	}

	
	
	public static void main(int n) {
		System.out.println("int type main method called args");
	}
	
	public static void main(String n) {
		System.out.println("String type main method called args");
	}

	
	public static void main(int[] n) {
		System.out.println("int type array main method called args");
	}
	
	public static void main(String[] n,String s) {
		System.out.println("String array type,string type main method called args");
	}

	public static void main(String[] args) {
		main(1);
		Bank b = new Bank();
		b.myClass();

		new AadharUpdate().myClass();
	}

}

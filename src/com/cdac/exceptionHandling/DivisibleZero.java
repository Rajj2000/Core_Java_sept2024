package com.cdac.exceptionHandling;

import java.util.Scanner;

/**
 * /**
 * 
 * 1. *Divide by Zero Exception:* Write a program that takes two integers as
 * input and calculates their division. Handle the ArithmeticException that may
 * occur if the user attempts to divide by zero. Display an error message if
 * such an exception occurs.
 * 
 * */

public class DivisibleZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num1: ");
		int num2=sc.nextInt();
		int ans=0;
		try {
			ans=num1/num2;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(ans);
	}

}

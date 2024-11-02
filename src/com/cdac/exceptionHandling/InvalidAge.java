package com.cdac.exceptionHandling;

/**
 * 3. *Custom Exception:* Create a custom exception class called
 * InvalidAgeException. Write a program that takes the age of a person as input
 * and throws this exception if the age is less than 0 or greater than 120.
 */
public class InvalidAge {

	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 120) {
			System.out.println("age checking...");
			throw new InvalidAgeException("Age must be between 0 and 120..");
		} else {
			System.out.println("Valid age...");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(125);
		} catch (InvalidAgeException e) {
			System.out.println("Exception : " + e.getMessage());
		}
		System.out.println("hii");
	}

}

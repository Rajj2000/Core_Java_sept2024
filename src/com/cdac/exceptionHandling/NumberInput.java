package com.cdac.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInput {

	public static void checkNumber() throws NegativeNumberException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number: ");

		try {
			int num = sc.nextInt();

			if (num < 0) {
				throw new NegativeNumberException("you entered negative integer number ");
			} else {
				System.out.println(num + " is valid integer number... ");
			}
		} catch (InputMismatchException ie) {
			System.err.println("Enter int type data only... " + ie);
		} finally {
			sc.close();
		}

	}

	public static void main(String[] args) {
		try {
			checkNumber();
		} catch (NegativeNumberException ne) {
			System.err.println(ne.getMessage());
		}
	}

}

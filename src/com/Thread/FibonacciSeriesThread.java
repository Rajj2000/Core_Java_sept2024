package com.Thread;

/**
 * Write a multi threaded Java program to print prime numbers between 1 to 1000
 * and Fibonacci series unto 1000 using two separate threads and find common
 * numbers using the third thread.
 */
public class FibonacciSeriesThread extends Thread {

	public void run() {
		int a = 0, b = 1;

		System.out.println("Fibonacci Series: ");
		while (a < 1000) {
			PrimeAndFibonacciSeries.fibseries.add(a);
			System.out.print(" " + a);
			int temp = a + b;
			a = b;
			b = temp;
		}System.out.println();
	}
}

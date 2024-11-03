package com.Thread;

public class PrimeNumbersThread extends Thread {

	public void run() {
		int num = 0;
		System.out.println("Prime num: ");
		while (num <= 1000) {
			if (isPrime(num)) {
				PrimeAndFibonacciSeries.primenumbers.add(num);
				System.out.print(" "+num);
			}
			num++; 
		}
		System.out.println();
	}

	public boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}

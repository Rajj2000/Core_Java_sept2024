package com.Thread;

import java.util.ArrayList;
import java.util.List;

public class PrimeAndFibonacciSeries {
	public static List<Integer> fibseries = new ArrayList<>();
	public static List<Integer> primenumbers = new ArrayList<>();

	public static void main(String[] args) {
		PrimeNumbersThread primeThread = new PrimeNumbersThread();
		FibonacciSeriesThread fibThread = new FibonacciSeriesThread();
		Common_Numbers_Thread commonNumThread = new Common_Numbers_Thread();

		primeThread.start();
		try {
			primeThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fibThread.start();
		try {
			fibThread.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		commonNumThread.start();
	}

}

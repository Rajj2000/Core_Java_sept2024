package com.Thread;

import java.util.ArrayList;
import java.util.List;

public class Common_Numbers_Thread extends Thread {

	public void run() {
		List<Integer> commonNumbers = new ArrayList<>(PrimeAndFibonacciSeries.primenumbers);
		commonNumbers.retainAll(PrimeAndFibonacciSeries.fibseries);
		System.out.println("common numbers : \n"+commonNumbers);
	}
}

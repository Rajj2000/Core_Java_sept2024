package com.cdac.exceptionHandling;

/**
 * 2. *Array Index Out of Bounds Exception:* Create an array of integers. Prompt
 * the user for an index and attempt to access the array at that index. Handle
 * the ArrayIndexOutOfBoundsException and inform the user if the index is out of
 * bounds.
 */

public class ArrayIndexOutOfBoundEx {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int num=arr.length+1;
		try {
			System.out.println(arr[num]);

		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Index "+num+" out of bounds");
		}
		System.out.println("hii");
	}

}

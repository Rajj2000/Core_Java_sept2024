package com.cdac.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 5. Resource Management (try-with-resources): Create a program that reads data
 * from a file using the BufferedReader class. Use the try-with-resources
 * statement to ensure that the BufferedReader is properly closed, even if an
 * exception occurs during the file reading process. Handle any exceptions that
 * may occur during file reading.
 */

public class FileHandlingException {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("D:/CDAC/Java/prac/Java_OOP/src/com/cdac/exceptionHandling/ReadOnly.txt");
			try (BufferedReader br = new BufferedReader(fr)) {
				int n = 0;

				while ((n = br.read()) != -1) {
					System.out.print((char) n);
				}
			}
		} catch (IOException e) {
			System.err.println("an error occured while reading the file: "+e.getMessage());
		}
	}

}

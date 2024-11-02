package com.filehandling;

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

public class FileHandling_Exception {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:/CDAC/Java/prac/Java_OOP/src/com/filehandling/File1.txt");
			BufferedReader br = new BufferedReader(fr);

			int num;

			while ((num = br.read()) != -1) {
				System.out.print((char) num);
			}
		} catch (IOException ioe) {
			System.out.println("Error occured during file reading.." + ioe.getMessage());
		}

	}

}

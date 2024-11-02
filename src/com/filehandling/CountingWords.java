package com.filehandling;

import java.io.FileReader;
import java.io.IOException;

/**
 * 2. *Counting Words in a File:* Create a program that reads a text file and
 * counts the number of words and characters in it. Display the result to the
 * user. Handle any exceptions that may occur during file reading.
 */
public class CountingWords {

	public static void couting() throws IOException  {
		FileReader fr = new FileReader("D:/CDAC/Java/prac/Java_prac/src/dem.txt");
		int c,countWord=0,countChar = 0;
		while ((c = fr.read()) != -1) {
			System.out.print((char) c);
			countChar++;
			if((char)c==' ') {
				countWord++;
			}
		}
		System.out.println("\nChar count is -> "+countChar);
		System.out.println("Word count is -> "+(countWord+1));

	}

	public static void main(String[] args) {
		try {
			couting();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occur during file reading "+e.getMessage());
		}
	}

}

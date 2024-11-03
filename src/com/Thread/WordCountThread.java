package com.Thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 4. Write a Word Count program and count words form two or more files files.
 * Write separate threads to count words from a specific file and display word
 * count of each file
 */
public class WordCountThread implements Runnable {

	private String path;
	private int wcount = 0;

	public WordCountThread(String path) {
		this.path = path;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s");

//				("[//s.,]+") -> '+' used for to treat multiple item as single
//				String[] words = line.split("[\\s.,]+");

//                String[] words = line.split("[\\s.,!?;:]+");

				wcount += words.length;
			}

			System.out.println("Word count For " + path + " : " + wcount);
		} catch (FileNotFoundException e) {
			System.err.println("File not found " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String[] path = { "D:/CDAC/Java/prac/Java_oops/Resources/F1.txt",
				"D:/CDAC/Java/prac/Java_oops/Resources/F2.txt" };

		for (String p : path) {
			WordCountThread w1 = new WordCountThread(p);
			Thread t = new Thread(w1);
			t.start();
		}
	}
}

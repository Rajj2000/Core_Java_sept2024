package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 3. *Appending to a File:* Write a program that prompts the user to enter
 * lines of text. Append each line to an existing text file. Allow the user to
 * specify the file name. Handle the IOException that may occur during file
 * writing.
 */

public class AppendingToFile {

	public static void main(String[] args) {
		String path = "D:/CDAC/Java/prac/Java_prac/src/";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name: ");
		String inpFile = path + sc.next();
		sc.nextLine();
		System.out.println("Enter data to append file: ");
		StringBuilder pararaph=new StringBuilder();
		String d;
		while(true) {
			d = sc.nextLine();
			pararaph=pararaph.append(d).append(System.lineSeparator());
			if(d.equalsIgnoreCase("exit")) {
				break;
			}
		}

		try (FileWriter fw = new FileWriter(inpFile, true); BufferedWriter bw = new BufferedWriter(fw);) {
			bw.append(pararaph);
			System.out.println("Data append successfully");
		} catch (IOException e) {
			System.out.println("Exception occur during file writing " + e.getMessage());
		}

	}

}

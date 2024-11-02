package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * File Handling: 1. *File Reading and Writing:* Write a program that reads the
 * contents of a text file and writes them to a new file. Allow the user to
 * specify the names of the input and output files as command-line arguments.
 * Handle the FileNotFoundException if the input file is not found.
 * 
 */

//console program open with CMD
public class FileReadWrite {
	public static void main(String[] args) {

		if (args.length < 2) {
			System.err.println("Usage: java FileReadWrite <inputFile> <outputFile>");
			return;
		}

		String inputFileName = args[0];
		String outputFileName = args[1];
		try (BufferedReader br = new BufferedReader(new FileReader("D:/CDAC/Java/"+inputFileName));
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:/CDAC/Java/"+outputFileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("file copied successfully from " + inputFileName + " to " + outputFileName);

		} catch (FileNotFoundException f) {
			System.out.println("Input file not found " + inputFileName);
		} catch (IOException io) {
			System.err.println("An error occurred during file reading/writing: " + io.getMessage());

		}

	}
}

package com.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 4. *Copying Binary Files:* Create a program that copies the contents of one
 * binary file to another. Allow the user to specify the names of the input and
 * output files. Handle the necessary exceptions, such as FileNotFoundException
 * and IOException.
 */

public class CopyBinaryFile {

	public static void main(String[] args) {
		String path="D:/CDAC/Java/prac/Java_prac/src/";
		System.out.println("Enter File name to copy: ");
		Scanner sc=new Scanner(System.in);
		String file=path+sc.next()+".data";
		
		System.out.println("Enter new file name to store copied data: ");
		String newFile=path+sc.next()+".data";
		
		/*
		try (FileInputStream fis = new FileInputStream(file);
				//BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos=new FileOutputStream(newFile);
			)
		{
			int i;
			while ((i=fis.read())!=-1) {
				fos.write((char)i);
			}
			System.out.println("File copied success..");
		} catch (FileNotFoundException e) {
			System.err.println("check once file name "+e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		*/
		
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
			)
		{
			byte [] arr=new byte[8192];
			int ch;
			while((ch=bis.read(arr))!=-1) {
				bos.write(arr,0,ch);
				System.out.println(ch+" total nos");
			}
			
		}
		catch (FileNotFoundException e) {
			System.err.println("check once file name "+e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
}

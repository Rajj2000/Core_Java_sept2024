package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonSerialized {

	public static void main(String[] args) {

		Person p = new Person("Raj", 25,10000);
		System.out.println(p);

		// serialization
		try (FileOutputStream fos = new FileOutputStream("D:/CDAC/Java/prac/Java_prac/src/Person.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(p);
			System.out.println("Serialization Success...");

			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("D:/CDAC/Java/prac/Java_prac/src/Person.data"));
			Person p1=(Person)ois.readObject();
			System.out.println("De-Serialization success..");
			System.out.println(p1);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}

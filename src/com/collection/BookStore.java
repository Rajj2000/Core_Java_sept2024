package com.collection;

import java.util.HashSet;
import java.util.Set;

public class BookStore {

	public static void main(String[] args) {
		Set<Book> b1 = new HashSet<Book>();
		b1.add(new Book(205, "English", "rahul", 1400.50));
		b1.add(new Book(102, "Maths", "Anna", 142.50));
		b1.add(new Book(105, "Hindi", "Lucky", 140.50));
		b1.add(new Book(206, "Java", "John", 750.50));
		b1.add(new Book(51, "C", "Abraham", 450));

		b1.forEach(System.out::println);

	}

}

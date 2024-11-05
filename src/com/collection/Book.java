package com.collection;


/*
 * 5. Using HashSet Problem:
 * 		Create a Book class with attributes such as id, title, author, and price. 
		Write a Java program to store a collection of Book objects in a HashSet. Implement
 		methods to add, remove, and search for books by their id.
 */
public class Book {

	private int id;
	private String title;
	private String author;
	private double price;

	public Book(int id, String title, String author, double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	

}

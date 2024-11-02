package com.filehandling;

import java.io.Serializable;

/**
 * 5. *Serializing and Deserializing Objects:* Create a class Person with
 * attributes like name and age. Write a program that serializes an object of
 * this class to a file and then deserializes it, displaying the object's
 * details. Handle the IOException and ClassNotFoundException that may occur
 * during serialization and deserialization.
 */
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private transient int salary;
	public Person(String name, int age,int salary) {
		this.age = age;
		this.salary=salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary="+salary+"]";
	}

}

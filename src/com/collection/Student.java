package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * : Create and Traverse a List of User-Defined Objects Write a Java program to
 * create a list of Student objects, add 5 students to it, and traverse the list
 * to print each student's details (id, name, grade).
 */
public class Student {
	private int id;
	private String name;
	private double grade;

	public Student(int id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "Raj", 85.5));
		student.add(new Student(2, "Ayush", 95.5));
		student.add(new Student(3, "Baban", 80.5));
		student.add(new Student(4, "Akash", 85.56));
		student.add(new Student(5, "Rajaram", 90.5));
		student.add(new Student(6, "Aman", 95.56));

//		for (Student s : student)
//			System.out.println("{ Id:- " + s.getId() + " , Name:- " + s.getName() + " , Grade:- " + s.grade + " }");

		/*
		 * 2: Find the Student with the Highest Grade Write a Java program to find the
		 * student with the highest grade in a list of Student objects
		 */
		student.forEach(s -> System.out
				.println("{ Id:- " + s.getId() + " , Name:- " + s.getName() + " , Grade:- " + s.grade + " }"));

		Optional<Student> topStudent = student.stream().max(Comparator.comparingDouble(Student::getGrade));
		if (topStudent.isPresent()) {
			System.out.println("Highest grade-> " + topStudent.get().getName());
		} else {
			System.out.println("no Students in list");
		}

		/*
		 * 3: Sort Students by Name Write a Java program to sort a list of Student
		 * objects by their name.
		 */

		List<Student> stud = new ArrayList<>(student);
		Collections.sort(stud, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		stud.forEach(System.out::println);
		
	}
}

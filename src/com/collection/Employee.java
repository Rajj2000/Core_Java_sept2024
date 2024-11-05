package com.collection;

/*
 * 4: Create and Traverse a Set of User-Defined Objects
Write a Java program to create a set of Employee objects, add 5 employees to it, 
and traverse the set to print each employee's details (id, name, department).
 * */
import java.util.HashSet;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private String department;

	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	public static void main(String[] args) {
		Set<Employee> emp = new HashSet<>();
		emp.add(new Employee(1, "Aman", "HR"));
		emp.add(new Employee(5, "Lucky", "HR"));
		emp.add(new Employee(4, "Sham", "Maketing"));
		emp.add(new Employee(2, "Raj", "Tech"));
		emp.add(new Employee(3, "Ayush", "Tech"));

//		for (Employee employee : emp)
//			System.out.println(employee);

//		System.out.println(emp);
		emp.stream().forEach(System.out::println);
	}
}

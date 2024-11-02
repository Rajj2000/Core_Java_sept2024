package com.cdac.encapsulation;

public class Encap {
	
	private int id=1;		// primitive type ref var
	private String name="Akash";  // class type ref var
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void getData() {
		System.out.println("Id -> "+id+"\nName -> "+name);
	}
	
	public static void main(String[] args) {
//		Encap e1=new Encap();
//		e1.setId(1);
//		e1.setName("Akash");
		Encap e1=new Encap();
		e1.getData();
	}
}

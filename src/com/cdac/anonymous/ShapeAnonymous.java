package com.cdac.anonymous;

public class ShapeAnonymous {

	public static void createShape() {
		Shape s = new Shape() {
			@Override

			public void draw() {
				System.out.println("Drawing Shape...");
			}
		};
		s.draw();
	}

	public static void main(String[] args) {
		ShapeAnonymous s1=new ShapeAnonymous();
		s1.createShape();
	}

}

package com.cdac.anonymous;

public class GreetingGenerator {
	
	public void generateGreeting() {
		Greeting g = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("Hello...");
			}
		};
		g.sayHello();
	}

	public static void main(String[] args) {
		GreetingGenerator g1=new GreetingGenerator();
		g1.generateGreeting();

	}

}

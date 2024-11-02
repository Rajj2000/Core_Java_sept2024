package com.Thread;
/**
 * 
 * */
public class ThreadMessage extends Thread {
	@Override
	public void run() {
		System.out.println("Good Morning");
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		
		ThreadMessage t1=new ThreadMessage();
		t1.start();

	}

}

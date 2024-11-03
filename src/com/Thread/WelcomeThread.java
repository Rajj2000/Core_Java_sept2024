package com.Thread;

/**
 *  Write a program to print "Good morning" and "Welcome" continuously on the
 * screen in Java using threads.
 */
class GMThread extends Thread {
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println("Good Morning");
		}
	}
}

public class WelcomeThread extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {

		WelcomeThread t1 = new WelcomeThread();
		GMThread g1 = new GMThread();
		t1.start();
		g1.start();

	}

}

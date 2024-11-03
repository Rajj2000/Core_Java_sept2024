package com.Thread;

/**
 * 2. Demonstrate gerPriority() and setPriority() , currentThread() methods in
 * Java threads.
 */
public class ThreadPriority extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName() + " " + getPriority());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		t1.setName("HighPriorityThread");
		t2.setName("LowPriorityThread");
		t3.setName("NormalPriorityThread");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();		
		
		t3.start();
	}

}

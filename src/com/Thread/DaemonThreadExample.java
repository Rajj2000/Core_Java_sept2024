package com.Thread;

class DaemonThreadExample extends Thread {

    @Override
    public void run() {
        // Check if this thread is a daemon thread
        if (isDaemon()) {
            System.out.println("This is a daemon thread running.");
        } else {
            System.out.println("This is a user thread running.");
        }
        
        // The daemon thread keeps running until the JVM shuts down
        for (int i = 1; i <= 10; i++) {
            System.out.println("Daemon thread working in background... " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample daemonThread = new DaemonThreadExample();
        daemonThread.setDaemon(true); // Set this thread as a daemon thread
        daemonThread.start();

        // Main thread doing its work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread working... " + i);
            try {
                Thread.sleep(700); // Sleep for 700 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread finished.");
        // When main thread ends, the JVM terminates, and daemon thread stops.
    }
}

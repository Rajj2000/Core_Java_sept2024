package com.cdac.exceptionHandling;


class StringBufferExample implements Runnable {
    private StringBuffer sharedBuffer;

    public StringBufferExample(StringBuffer buffer) {
        this.sharedBuffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedBuffer.append(Thread.currentThread().getName()).append(" ");
            System.out.println("StringBuffer - " + Thread.currentThread().getName() + ": " + sharedBuffer.toString());
        }
    }
}

class StringBuilderExample implements Runnable {
    private StringBuilder sharedBuilder;

    public StringBuilderExample(StringBuilder builder) {
        this.sharedBuilder = builder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedBuilder.append(Thread.currentThread().getName()).append(" ");
            System.out.println("StringBuilder - " + Thread.currentThread().getName() + ": " + sharedBuilder.toString());
        }
    }
}

public class ThreadSafetyExample {
    public static void main(String[] args) {
        // Using StringBuffer (Thread-safe)
        System.out.println("Using StringBuffer (Thread-safe):");
        StringBuffer buffer = new StringBuffer("Start ");
        Thread t1 = new Thread(new StringBufferExample(buffer), "Thread 1");
        Thread t2 = new Thread(new StringBufferExample(buffer), "Thread 2");

        t1.start();
        t2.start();

        // Wait for StringBuffer threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Using StringBuilder (Not Thread-safe)
        System.out.println("\nUsing StringBuilder (Not Thread-safe):");
        StringBuilder builder = new StringBuilder("Start ");
        Thread t3 = new Thread(new StringBuilderExample(builder), "Thread 3");
        Thread t4 = new Thread(new StringBuilderExample(builder), "Thread 4");

        t3.start();
        t4.start();
    }
}

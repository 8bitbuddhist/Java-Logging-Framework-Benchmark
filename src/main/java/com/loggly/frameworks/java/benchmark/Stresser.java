package com.loggly.frameworks.java.benchmark;

public class Stresser {
	private Thread[] threads;
	
	public Stresser(int numThreads) {
		threads = new Thread[numThreads];
	}
	
	public void start() {
		System.out.println("Starting stress test.");
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new StressRunnable());
			threads[i].start();
		}
	}
	
	public void stop() {
		System.out.println("Stopping stress test.");
		for (int i = 0; i < threads.length; i++) {
			threads[i].interrupt();
		}
	}
}

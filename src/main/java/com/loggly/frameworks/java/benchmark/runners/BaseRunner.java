package com.loggly.frameworks.java.benchmark.runners;

public abstract class BaseRunner {
	
	public abstract void run(int iteration, int numRuns); 
	
	public void warmup(int numRuns) {
		System.out.println("Starting warmup.");
		this.run(0, numRuns);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.err.println(String.format("Error during warmup sleep: %s", e));
		}
		System.out.println("Finished warmup.");
	}
}

package com.loggly.frameworks.java.benchmark;

public class StressRunnable implements Runnable {
		
	public void run() {
		int num = 1;
		while(!Thread.currentThread().isInterrupted()) {
			if (!(num % 2 == 0)) {
				for (int i = 3; i * i <= num; i+= 2) {
					if (num % i == 0) {
						break;
					}
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				return;
			}
			num++;
		}
		return;
	}
}

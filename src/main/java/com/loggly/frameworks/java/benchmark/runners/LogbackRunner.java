package com.loggly.frameworks.java.benchmark.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackRunner extends BaseRunner {

	private final Logger logger = LoggerFactory.getLogger(LogbackRunner.class);
	
	@Override
	public void run(int iteration, int numRuns) {
		for (int run = 1; run <= numRuns; run++) {
			 logger.info(String.format("Iteration %1$s, run %2$s", iteration, run));
		 }
	}
	
	public static void setConfigurationFile(String fileName) {
		System.setProperty("logback.configurationFile", fileName);
	}
}

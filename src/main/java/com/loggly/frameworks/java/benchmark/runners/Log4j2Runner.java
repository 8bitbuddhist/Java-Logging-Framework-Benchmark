package com.loggly.frameworks.java.benchmark.runners;

import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.Logger;

public class Log4j2Runner extends BaseRunner {
	
	 private final Logger logger = org.apache.logging.log4j.LogManager.getLogger(Log4j2Runner.class);
	 	 
	 public void run(int iteration, int numRuns) {
		 for (int run = 1; run <= numRuns; run++) {
			 logger.info(String.format("Iteration %1$s, run %2$s", iteration, run));
		 }
	 }

	 public static void setConfigurationFile(String fileName) {
		 Configurator.initialize(null, fileName);
	 }
}

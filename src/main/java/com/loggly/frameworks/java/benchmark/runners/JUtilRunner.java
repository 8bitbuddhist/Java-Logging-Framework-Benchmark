package com.loggly.frameworks.java.benchmark.runners;

import java.util.logging.Logger;

import java.io.FileInputStream;
import java.util.logging.LogManager;

public class JUtilRunner extends BaseRunner {

	private static final Logger logger = Logger.getLogger(JUtilRunner.class.getName());
	
	@Override
	public void run(int iteration, int numRuns) {
		for (int run = 1; run <= numRuns; run++) {
			logger.info(String.format("Iteration %1$s, run %2$s", iteration, run));
		}
	}
	
	public static void setConfigurationFile(String fileName) {
		try {
			FileInputStream configFile = new FileInputStream(fileName);
			LogManager.getLogManager().readConfiguration(configFile);
		} catch (Exception e) {
			logger.warning(String.format("Failed to load config file: %s", e));
		}
	}
}

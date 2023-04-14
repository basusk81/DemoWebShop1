package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo1 {
	
	static Logger logger = LogManager.getLogger(Log4jDemo1.class);
	
	
	
	public static void main(String[] args) {
	
		System.out.println("Hello World");
		logger.info("This is info");
		logger.error("This is error");
		logger.warn("This is warn");
		logger.fatal("This is fatal");
		logger.trace("This is a Trace");
		System.out.println("Complete");
		
	}

}

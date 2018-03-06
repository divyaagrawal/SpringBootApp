package com.java.magicPos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {

	private static final Logger logger = LogManager.getLogger(SpringBootApp.class);

	public static void main(String ar[])
	{
		SpringApplication.run(SpringBootApp.class, ar);
		 	//logger.debug("Debugging log");
	        logger.info("MagicPos Application has started");
	        //logger.warn("Hey, This is a warning!");
	        //logger.error("Oops! We have an Error. OK");
	        //logger.fatal("Damn! Fatal error. Please fix me.");
		
	}
	
}

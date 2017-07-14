package com.kgfsl.abc;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.*;
public class Log4jExample {
 static{
       init();
    }  
   
    private final static Logger logger = Logger.getLogger(Log4jExample.class);
        
     
    public static void main(String[] args)
     {

        logger.debug("My Debug Log");
        logger.info("My Info Log");
        logger.warn("My Warn Log");
        logger.error("My error log");
        logger.fatal("My fatal log");
        
    }
    private static void init() {
        PropertyConfigurator.configure("D://log4jtest//target//classes//log4j.properties");
    }
}
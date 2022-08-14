package solvd_02.hospital.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J {

    static Logger logger = LogManager.getLogger(Log4J.class);
    public static void main(String[] args) {

        System.out.println("Hello World");

        logger.info("This is information message");
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.fatal("This is fatal  error message");

        System.out.println("Completed");
        System.out.println("Completed");

    }
}

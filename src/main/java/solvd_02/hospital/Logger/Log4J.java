package solvd_02.hospital.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J {

    private static Logger LOGGER = LogManager.getLogger(Log4J.class);

    private static void main(String[] args) {

        LOGGER.info("Hello World");

        LOGGER.info("This is information message");
        LOGGER.error("This is an error message");
        LOGGER.warn("This is a warning message");
        LOGGER.fatal("This is fatal  error message");

        LOGGER.info("Completed");
        LOGGER.info("Completed");

    }
}

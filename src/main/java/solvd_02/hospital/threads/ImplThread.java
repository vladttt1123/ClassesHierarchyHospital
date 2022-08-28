package solvd_02.hospital.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Creating Thread by implementing Runnable ( functional interface _
 */
public class ImplThread implements Runnable {
    private static Logger LOGGER = LogManager.getLogger(ImplThread.class);

    public static void main(String[] args) {
        LOGGER.info(Thread.currentThread().getName()); // --checking if MAIN Thread started

        Thread t2 = new Thread(new ImplThread());

        t2.start();
    }


    @Override
    public void run() {
        LOGGER.info(Thread.currentThread().getName());
    }
}

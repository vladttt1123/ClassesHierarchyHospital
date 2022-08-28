package solvd_02.hospital.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Creating Thread by extending Thread
 * Step 1. Refer to the class Thread
 * Step 2. Override method run();
 * Step 3. Create an instance of  ExtThread
 * Step 4. call method start on the instance of ExtThread ( start implicitly calls method run )
 * Step 5. when methon run() worked, the thread stops working
 */
public class ExtThread extends Thread {
    private static Logger LOGGER = LogManager.getLogger(ExtThread.class);

    public static void main(String[] args) {
        LOGGER.info(Thread.currentThread().getName()); // --checking if MAIN Thread started
        Thread t1 = new Thread(new ExtThread());
        t1.start(); // start implictly calls method run
    }

    @Override
    public void run() {
        LOGGER.info(Thread.currentThread().getName());
    }
}

package solvd_02.hospital.threads;

/**
 * Creating Thread by extending Thread
 * Step 1. Refer to the class Thread
 * Step 2. Override method run();
 * Step 3. Create an instance of  ExtThread
 * Step 4. call method start on the instance of ExtThread ( start implicitly calls method run )
 * Step 5. when methon run() worked, the thread stops working
 */
public class ExtThread extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // --checking if MAIN Thread started
        Thread t1 = new Thread(new ExtThread() );
        t1.start(); // start implictly calls method run
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

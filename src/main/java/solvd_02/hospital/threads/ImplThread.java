package solvd_02.hospital.threads;

/**
 * Creating Thread by implementing Runnable ( functional interface _
 */
public class ImplThread implements Runnable{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // --checking if MAIN Thread started

        Thread t2 = new Thread( new ImplThread());

        t2.start();
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

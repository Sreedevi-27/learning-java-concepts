package multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadCreation2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 2");
    }

    public static void main(String[] args) {
       ThreadCreation2 threadCreation2  = new ThreadCreation2();
        Thread thread = new Thread(threadCreation2);
        thread.start();
        System.out.println("Main thread");
    }
}

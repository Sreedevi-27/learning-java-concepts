package multithreading;

public class ThreadCreation2 implements Runnable{
    public static void main(String[] args) {
       ThreadCreation2 threadCreation2  = new ThreadCreation2();
        Thread thread = new Thread(threadCreation2);
        thread.start();
        System.out.println("Main thread");
    }

    @Override
    public void run() {
        System.out.println("Thread 2");
    }
}

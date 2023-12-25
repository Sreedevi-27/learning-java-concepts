package multithreading;

public class ThreadCreation1 extends Thread{
    public static void main(String[] args) {
        ThreadCreation1 threadCreation = new ThreadCreation1();
        threadCreation.start();
        System.out.println("Main Thread");
    }

    @Override
    public void run() {
        System.out.println("Thread 1 created");
    }
}

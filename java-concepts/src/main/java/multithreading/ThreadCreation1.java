package multithreading;

public class ThreadCreation1 extends Thread{
    public static void main(String[] args) {
        ThreadCreation1 threadCreation = new ThreadCreation1();
        threadCreation.start();
        for(int i=0; i<10; i++)
            System.out.println("Main Thread");
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println("Thread 1 created");
    }
}
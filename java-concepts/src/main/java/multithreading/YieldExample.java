package multithreading;
// yield() method pauses the current executing thread and gives a chance to other threads with the same or higher priority

public class YieldExample{
    public static void main(String[] args) throws InterruptedException {
        Yield1 yield1 = new Yield1();
        Thread thread = new Thread(yield1);
        thread.start();
        for (int i=0; i<10; i++)
            System.out.println("Main method");
    }
}

class Yield1 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Yield method");
            Thread.yield();
        }
    }
}
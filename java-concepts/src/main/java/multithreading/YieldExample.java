package multithreading;

public class YieldExample implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        YieldExample yieldExample = new YieldExample();
        Thread thread = new Thread(yieldExample);
        thread.start();
        System.out.println("Main method - 1");
        Thread.yield();
        System.out.println("Main method");
    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}

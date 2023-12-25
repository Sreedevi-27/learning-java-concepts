package multithreading;

public class SleepExample implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Sleep Interrupted");
            }
            System.out.println("Sleep Example");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepExample sleepExample = new SleepExample();
        Thread thread = new Thread(sleepExample);
        thread.start();
        thread.interrupt();
        System.out.println("Main");
    }
}

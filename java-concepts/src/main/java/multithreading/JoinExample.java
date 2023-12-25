package multithreading;

public class JoinExample implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        JoinExample joinExample = new JoinExample();
        Thread thread = new Thread(joinExample);
        thread.start();
        thread.join(4000);
        for(int i=0; i<10; i++)
            System.out.println("main"+i);
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Run"+i);
        }
    }
}

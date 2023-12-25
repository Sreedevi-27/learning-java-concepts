package multithreading;

public class ThreadGroupExample {
    public static void main(String[] args) {
        // get Main Thread group
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        // System is the parent of all the Thread groups in java
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup threadGroup = new ThreadGroup("Sree Thread Group");
        Thread thread1 = new Thread(threadGroup, new Thread1(), "Thread 1");
        Thread thread2 = new Thread(threadGroup, new Thread1(), "Thread 3");
        Thread thread3 = new Thread(threadGroup, new Thread1(), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("---"+threadGroup.activeCount());
        threadGroup.list();
     //   threadGroup.interrupt();
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended...");
    }
}
//
//class Thread2 extends Thread{
//    @Override
//    public void run(){
//
//    }
//}
package multithreading;

public class ThreadName {
    public static void main(String[] args) {
        ThreadName1 threadName1 = new ThreadName1();
        Thread thread1 = new Thread(threadName1);
        thread1.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("I'm Main thread");
        System.out.println(Thread.currentThread().getName());

        ThreadName2 threadName2 = new ThreadName2();
        Thread thread2 = new Thread(threadName2);
        thread2.start();
    }
}

class ThreadName1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("I'm Runnable thread");
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadName2 extends ThreadName1{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("I'm Child Runnable thread");
        System.out.println(Thread.currentThread().getName());
    }
}
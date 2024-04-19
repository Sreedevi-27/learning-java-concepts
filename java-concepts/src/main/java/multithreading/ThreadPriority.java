package multithreading;

// The valid range of Thread priorities is 1 to 10, where 1 is Min Priority and 10 is Max Priority.
// By default, all threads have priority 5
// For all threads default priority will be inherited from parent thread to child.

public class ThreadPriority {
    public static void main(String[] args) {
        ThreadPriority1 threadPriority1 = new ThreadPriority1();
        Thread thread1 = new Thread(threadPriority1);
        thread1.start();
        Thread.currentThread().setPriority(7);
        System.out.println("MAIN :"+Thread.currentThread().getPriority());

        ThreadPriority2 threadPriority2 = new ThreadPriority2();
        Thread thread2 = new Thread(threadPriority2);
        thread2.start();
    }
}

class ThreadPriority1 implements Runnable{
    @Override
    public void run() {
        System.out.println("RUNNABLE :"+Thread.currentThread().getPriority());
    }
}

class ThreadPriority2 extends ThreadPriority1{
    @Override
    public void run() {
        System.out.println("CHILD RUNNABLE :"+Thread.currentThread().getPriority());
    }
}

// Here, parent thread will always execute 1st because it has max priority than child
class ThreadPriority3 implements Runnable{
    public static void main(String[] args) {
        ThreadPriority3 threadPriority3 = new ThreadPriority3();
        Thread thread3 = new Thread(threadPriority3);
        thread3.start();

        ThreadPriority4 threadPriority4 = new ThreadPriority4();
        Thread thread4 = new Thread(threadPriority4);
        thread4.start();
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(10);
        System.out.println("PARENT :"+Thread.currentThread().getPriority());
    }
}


class ThreadPriority4 extends ThreadPriority3{
    @Override
    public void run() {
        Thread.currentThread().setPriority(5);
        System.out.println("CHILD :"+Thread.currentThread().getPriority());
    }
}
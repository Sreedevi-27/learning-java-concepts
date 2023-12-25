package innerClass;

public class AnonymousInnerClassExamples {
    public static void main(String[] args) {
        // Anonymous inner class that extends a class
        Thread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(){
            public void run(){
                System.out.println("Anonymous class extends MyThread class");
            }
        };

        // Anonymous inner class that implements an interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread3 = new Thread(myRunnable);
        thread3.start();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class implements MyRunnable interface");
            }
        };
        Thread thread4 = new Thread(runnable2);
        thread4.start();

        // Anonymous inner class that defined inside arguments
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class that defined inside arguments");
            }
        }).start();
    }
}


class MyThread extends Thread{
    public void run(){
        System.out.println("Child thread - in MyClass class");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Child thread - in MyRunnable interface");
    }
}
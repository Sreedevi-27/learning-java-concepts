package multithreading;

class DummyThread extends Thread{
    public static void main(String[] args) {
        DummyThread dummy = new DummyThread();
        dummy.start();      // Here, Thread class start() method will be called which internally calls run() method
        // Thread class run() method has no implementation
        System.out.println("Dummy main method");
    }
}

class DummyThread1 extends Thread{
    public static void main(String[] args) {
        DummyThread1 dummy = new DummyThread1();
        dummy.start();     // Thread class start() method will be called which internally calls no-args run() method
        System.out.println("Dummy main method");
    }

    @Override
    public void run() {
        System.out.println("No args run method");
    }

    // run() method can be overloaded
    public void run(int i) {
        System.out.println(i);
    }
}

class DummyThread2 extends Thread{
    public static void main(String[] args) {
        DummyThread2 dummy = new DummyThread2();
        dummy.start();     // Thread class start() method will be called which internally calls no-args run() method
        System.out.println("Dummy main method");
    }

    @Override
    public void start(){
        System.out.println("start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }
}

class DummyThread3 extends Thread{
    public static void main(String[] args) {
        DummyThread3 dummy = new DummyThread3();
        dummy.start();     // Thread class start() method will be called which internally calls no-args run() method
        System.out.println("main method");
    }

    @Override
    public void start(){
        super.start();  //
        System.out.println("start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }

    /*
    possible output-1
      run method
      start method
      main method
    possible output-2
      start method
      main method
      run method
    possible output-3
      start method
      run method
      main method
     */
}
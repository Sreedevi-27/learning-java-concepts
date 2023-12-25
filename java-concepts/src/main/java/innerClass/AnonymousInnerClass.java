package innerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();

        // Anonymous inner class that extends Parent[AnonymousInnerClass] class
        AnonymousInnerClass anonymousInnerClass1 = new AnonymousInnerClass(){  // creating child class object with Parent reference
        };

        //  The anonymous inner class extends Thread interface
        // new Thread() {}; -> object of child class
        Thread thread = new Thread(){
        };

        // The anonymous inner class implements Runnable interface
        // new Runnable() {}; -> object of implemented class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            }
        };

        A a = new A(){
            // This method is overridden by the anonymous child class
            public void m1(){
                System.out.println("Anonymous class extends class A");
            }
        };
        a.m1();

        A a1 = new A();
        a1.m1();

        System.out.println(a.getClass().getName());
        System.out.println(a1.getClass().getName());

        B b = new B(){
            @Override
            public void m2() {
                System.out.println("Anonymous class implements B interface");
            }
        };
        b.m2();
    }
}

class A{
    public void m1(){
        System.out.println("A class");
    }
}

interface B{
    void m2();
}
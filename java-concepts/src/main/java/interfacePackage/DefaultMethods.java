package interfacePackage;

/*
Interface can have default methods from JDK 8
There is no compulsion of overriding in case of Deafult methods. If needed, the child class override the Default method

 */
interface InterfaceWithDefaultMethod1{
    public static final int i=10;
    void print();
    default void printDefaultMethod1(){
        System.out.println("DEFAULT - 1 in class 1");
    }

    default void printDefaultMethod2(){
        System.out.println("DEFAULT - 2 in class 1");
    }
}

interface InterfaceWithDefaultMethod2{
    default void printDefaultMethod2(){
        System.out.println("DEFAULT - 2 in class 2");
    }
}

interface InterfaceWithDefaultMethod3 extends InterfaceWithDefaultMethod2{
    default void printDefaultMethod2(){
        System.out.println("Interface inheriting another");
    }
}

class D implements InterfaceWithDefaultMethod1, InterfaceWithDefaultMethod2{
    @Override
    public void print(){
        System.out.println("Overridden in child class");
    }

     public void printDefaultMethod1(){
        System.out.println("DEFAULT - 1 overridden in child class");
    }

    public void printDefaultMethod2(){
        InterfaceWithDefaultMethod1.super.printDefaultMethod1();
        InterfaceWithDefaultMethod1.super.printDefaultMethod2();   // for calling the method in the interface
        InterfaceWithDefaultMethod2.super.printDefaultMethod2();
        System.out.println("Child class method");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        InterfaceWithDefaultMethod1 interfaceWithDefaultMethod = new D();
        interfaceWithDefaultMethod.print();
        interfaceWithDefaultMethod.printDefaultMethod1();
        System.out.println("----------------------------------------------");
        interfaceWithDefaultMethod.printDefaultMethod2();  // child class method takes the priority
        System.out.println("----------------------------------------------");

        D d = new D();
        d.printDefaultMethod2();
    }
}

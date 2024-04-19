package functionalInterface;

// Interface that contains only one abstract method but any number of default and static methods

@FunctionalInterface
interface FunInterface1{
    void m1();
//    void m2();

    default void defaultMethod1(){
        System.out.println("Default method");
    }

    default void defaultMethod2(){
        System.out.println("Default method");
    }

    static void staticMethod1(){
        System.out.println("Static method");
    }

    static void staticMethod2(){
        System.out.println("Static method");
    }
}

@FunctionalInterface
interface FunInterface2 extends FunInterface1{
    void m1();  // overriding abstract method in parent interface
//    void m3();   --> as it is functional interface, it can contain only one abstract method

    default void defaultMethod3(){
        System.out.println("Default method");
    }

    static void staticMethod3(){
        System.out.println("Static method");
    }
}


// the below one is not a fuctional interface, it is a normal interface
interface FunInterface3 extends FunInterface1{
    void m1();  // overriding abstract method in parent interface
    void m3();  // new method in child interface

    default void defaultMethod3(){
        System.out.println("Default method");
    }

    static void staticMethod3(){
        System.out.println("Static method");
    }
}

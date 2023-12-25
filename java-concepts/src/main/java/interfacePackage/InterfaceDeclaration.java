package interfacePackage;

// All the methods in the interface are by default public and abstract
// All the variables in the interface are by default public static and final

interface InterfaceDeclarationAndImplementation {
    void m1();

    void m2();
}

// The class which implements the interface must provide implementation for all the methods present in the interface.
// While overriding any method from the interface, the method should be declared as public.
// (while overriding, we should not reduce the scope of the method)
class A implements InterfaceDeclarationAndImplementation {
    public void m1() {
        System.out.println("Class A - method m1()");
    }

    public void m2() {
        System.out.println("Class A - method m1()");
    }
}

// If the class cannot give implementation to any of the methods in the interface, then the class should be declared as abstract.
abstract class B implements InterfaceDeclarationAndImplementation {
    @Override
    public void m1() {
        System.out.println("Class B -method m1()");
    }
}

class C extends B {
    public void m2() {
        System.out.println("Class C -method m2()");
    }
}


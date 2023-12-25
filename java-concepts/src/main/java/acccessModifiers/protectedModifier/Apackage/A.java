package acccessModifiers.protectedModifier.Apackage;

public class A {
    public static void main(String[] args) {
        A a = new A();
        a.m1();  // inside same class and same package
    }

    protected void m1() {
        System.out.println("PROTECTED method");
    }
}

class C {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); // inside same package, but outside class
    }
}
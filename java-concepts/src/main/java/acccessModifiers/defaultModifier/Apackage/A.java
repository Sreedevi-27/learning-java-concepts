package acccessModifiers.defaultModifier.Apackage;

import acccessModifiers.defaultModifier.Cpackage.C;

// Can be accessed inside the same package only

class A {
    public static void main(String[] args) {
        System.out.println("DEFAULT CLASS");
        InsideA insideA = new InsideA();
        insideA.method1();   // public method - same package
        insideA.method2();   // default method - same package

        C c = new C();
        //  c.methodC();  -> public class - default method - outside the package

        // B b = new B();  -> default class - outside the package gives compile time error
        // b.m1();   -> eventhough the method m1() is public, the class B is default. So, it cannot be accessed outside package


    }
}

class InsideA {
    public void method1() {
        System.out.println("Public method - inside same package");
    }

    void method2() {
        System.out.println("Default method - inside same package");
    }
}

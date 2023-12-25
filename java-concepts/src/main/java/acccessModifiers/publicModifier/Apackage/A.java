package acccessModifiers.publicModifier.Apackage;

import acccessModifiers.publicModifier.Bpackage.B;

// public class can be accessed from inside outside the package

public class A {
    public static void main(String[] args) {
        System.out.println("PUBLIC - A");
        B b = new B();  // outside the package
        b.m1();

        InsideA insideA = new InsideA();
        insideA.insideM1();  // inside the package
    }
}

class InsideA {
    public void insideM1() {
        System.out.println("Inside same package A");
    }
}
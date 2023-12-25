package acccessModifiers.protectedModifier.Bpackage;

import acccessModifiers.protectedModifier.Apackage.A;

// Outside the package, Parent class protected method (m1) can be accessed by Child class and compulsory we should use Child class reference.
public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.m1();

        System.out.println("j"+'a'+'v'+'a');
        A a1 = new A();
        // a1.m1();  -> cannot be accessed using Parent class reference

        A a2 = new B();
        // a2.m1();   -> cannot be accessed using Parent class reference
    }
}

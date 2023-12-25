package inheritancePackage;

public class Inheritance1 {
    public static void main(String[] args) {
        // parent reference can be used to hold parent as well as child objects
        A a = new A();
        // parent reference can be used to call only parent class methods and variables
        a.m1();
        // a.m2(); -> as m2() method is in Child class, it cannot be accessed using Parent class reference


        // child reference can only hold child objects
        B b = new B();
        // child reference can be used to call both parent and child class methods and variables
        b.m1();
        b.m2();


        // parent reference can be used to hold parent as well as child objects
        A ab = new B();
        ab.m1();
        // ab.m2(); -> by using this reference, we cannot access Child class methods/members


        // child reference cannot be used to hold parent object
        // B ba = new A();  -> incompatible type error

    }
}

class A{
    public void m1(){

    }
}

class B extends A{
    public void m2(){

    }
}
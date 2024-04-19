package abstractPackage;

// Abstract keyword can be used for the classes and method
// If a class contain one abstract method, then the class should be abstract class
abstract class AbstractClass1 {
    // Abstract method can have only declaration, not implementation
    int a = 5;
    AbstractClass1(int a){
        this.a = a;   // creating this alone i.e Creating parameterized constructor in Parent class gives error in child class.
    }                 // constructor with super(x) should be created in the child class

    public abstract void m1();

    public abstract void m2();

    public void m3() {
    }
}

// Child class is responsible for providing the implementation for the abstract method.
//  Child class should override all the abstract methods in parent class.
class Abstract1Child1 extends AbstractClass1 {
    Abstract1Child1(int a) {
        super(a);
    }

    @Override
    public void m1() {
        System.out.println("m1 in Abstract1Child1");
    }

    @Override
    public void m2() {
        System.out.println("m2 in Abstract1Child1");
    }
}


// If the class cannot give implementation to any of the methods in the interface, then the class should be declared as abstract.
abstract class Abstract1Child2 extends AbstractClass1 {
    Abstract1Child2(int a) {
        super(a);
    }

    @Override
    public void m1() {
        System.out.println("m1 in Abstract1Child2");
    }
}

class Abstract1Child2GrandChild extends Abstract1Child2 {
    Abstract1Child2GrandChild(int a) {
        super(a);
    }

    @Override
    public void m2() {
        System.out.println("m2 in Abstract1Child2GrandChild");
    }

    public static void main(String[] args) {
        Abstract1Child2 obj2 = new Abstract1Child2GrandChild(5);
        obj2.m1();
        obj2.m2();
    }
}


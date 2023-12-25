package acccessModifiers.privateModifier;

// Private method can be accessed only inside the class. not outside the class and package

public class A {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }

    private void m1() {
        System.out.println("Private method - inside same class");
    }
}

class B {
    public void m2() {
        A a = new A();
        //  a.m1(); -> cannot be accessed outside the class
    }
}
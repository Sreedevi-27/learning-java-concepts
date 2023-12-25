package polymorphism.overriding;

public class Overridding1 {
    public static void main(String[] args) {
        A a = new A();
        a.buySweets();

        B b = new B();
        b.buySweets();

        A ab = new B();
        ab.buySweets();
    }
}

class A{
    public void buySweets(){
        System.out.println("Buy kesari");
    }
}

class B extends A{
    public void buySweets(){
        System.out.println("Buy laddoos");
    }
}
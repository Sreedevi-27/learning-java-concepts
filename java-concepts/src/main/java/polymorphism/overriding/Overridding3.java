package polymorphism.overriding;

// If the parent class method has a private modifier then the method can't be overridden in the child class,
// the same method can be present in the child class but the method is not overridden.

// If the parent class method is final, then child class method(final/non-final),the method can't be overridden
// If the parent class method is non-final, then child class method(final/non-final),the method can be overridden
public class Overridding3 {
    public static void main(String[] args) {
        G g = new G();
//    g.m1();  -> private methods cannot  be accessed outside the class
        g.m2();
        g.m3();

        H h = new H();
        h.m1();
        h.m2();
        h.m3();

        G gh = new H();
        h.m1();
        h.m2();
        h.m3();
    }
}

class G{
    private void m1(){
        System.out.println("Private method");
    }

    public final void m2(){
        System.out.println("Final method-Parent class");
    }

    public void m3(){
        System.out.println("Non-final method-Parent class");
    }
}

class H extends G{
    public void m1(){
        System.out.println("Public method - not overridden");
    }

//    public void m2(){  -> final methods cannot be overridden
//
//    }

//    public final void m2(){
//
//    }

    public final void m3(){
        System.out.println("Final method-Child class");
    }
}


abstract class I extends G{
    public abstract void m3();
}

class J extends I{
    public void m3(){
        System.out.println("Overriding abstract method");
    }
}
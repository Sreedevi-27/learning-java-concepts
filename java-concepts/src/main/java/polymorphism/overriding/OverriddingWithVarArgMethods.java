package polymorphism.overriding;

// Var-arg method cannot be overridden by the normal method.
// If we have var-args method in parent class and normal method in child class with the same name then it is overloading and not overriding.
// In order to override var-arg method we should use var-arg method only in the child class

public class OverriddingWithVarArgMethods {
    public static void main(String[] args) {
        R r = new R();
        r.m1(10);

        S s = new S();
        s.m1(20);

        R rs = new S();
        rs.m1(30);  // It is not overriding. So method resolution decided by Reference type(compile time)

        R t = new T();
        t.m1(40); // It is not overriding. So method resolution decided by JVM at run-time
    }
}

class R{
    public void m1(int...i){
        System.out.println("Parent");
    }
}

class S extends R{
    // Overloading, not overridding
    public void m1(int i){
        System.out.println("Child");
    }
}

class T extends R{
    // Overridding
    public void m1(int...i){
        System.out.println("Child");
    }
}
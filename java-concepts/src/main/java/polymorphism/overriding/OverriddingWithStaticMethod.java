package polymorphism.overriding;

// Overriding static method with non-static method and vice-versa is not possible.
// If a parent class has a static method and we want the same method in child class also then we can have the
// same static method in child class also. But it is not method overriding, it is called method hiding.

public class OverriddingWithStaticMethod {
    public static void main(String[] args) {
        P p = new P();
        p.m3();

        Q q = new Q();
        q.m3();

        P pq = new Q();
        pq.m3();
    }
}

class P{
    public static void m1(){
        System.out.println("Parent class - static method");
    }

    public void m2(){
        System.out.println("Parent class - non-static method");
    }

    public static void m3(){
        System.out.println("Parent class - static method - method hiding");
    }
}

class Q extends P{
//    public void m1(){
//        System.out.println("Child class - non-static method");
//    }

//    public static void m2(){
//        System.out.println("Child class - static method");
//    }

    // It is not method overridding. It is method hiding
    public static void m3(){
        System.out.println("Child class - static method - method hiding");
    }
}
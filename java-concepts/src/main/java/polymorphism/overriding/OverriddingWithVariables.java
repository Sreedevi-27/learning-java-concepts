package polymorphism.overriding;

// Overriding is only for methods and not for variables.
// Variable resolution is taken care by the compiler based on reference type - for both static and non-static variables.
// It is called variable hiding / shadowing

public class OverriddingWithVariables {
    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.s1);
        System.out.println(x.s2);

        Y y = new Y();
        System.out.println(y.s1);
        System.out.println(y.s2);

        X xy = new Y();
        System.out.println(xy.s1);
        System.out.println(xy.s2);
    }
}

class X{
    String s1 = "Parent";
    static String s2 = "static - Parent";
}

class Y extends X{
    String s1 = "Child";
    static String s2 = "static - Child";
}
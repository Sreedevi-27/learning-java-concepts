package polymorphism.overloading;

// exact match has the highest priority.
// If both parent and child arguments are available for matching then child has the priority,
// if child is not matched then parent goes for matching.

public class MethodOverloading2 {
    public static void main(String[] args) {
        MethodOverloading2 methodOverloading2 = new MethodOverloading2();
        methodOverloading2.m1(new Object());
        methodOverloading2.m1("sree");
        methodOverloading2.m1(null);
    }

    public void m1(Object obj){
        System.out.println("Object method");
    }

    public void m1(String str){
        System.out.println("String method");
    }
}

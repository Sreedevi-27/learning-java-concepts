package innerClass;

// Class present inside a method is called method local inner classes.

// Use Case : a method ‘A’ is required for the method ‘B’ only(not for any other methods).
// The method ‘A’ cannot be declared inside the method ‘B’. So to support this concept, we can use method local inner classes.
public class MethodLocalInnerClass {
    int x = 5;
    static int y = 50;
    public static void main(String[] args) {
        MethodLocalInnerClass outer = new MethodLocalInnerClass();
        outer.m1();
        MethodLocalInnerClass.m2();
    }

    public void m1(){
        // Method Local Inner Class can be accessed only from the method in which it is declared
        int local = 10;   // by default it is final
         class Inner{
            public void insideInnerClass(){
                System.out.println("Method local inner class - non-static method");
                System.out.println(x+"----"+ y);
                System.out.println(local);
            }
        }
        Inner inner = new Inner();
        inner.insideInnerClass();
    }

    public static void m2(){
        class Inner{
            public void insideInnerClass() {
                System.out.println("Method local inner class - static method");
//                System.out.println(x);  --> non-static members cannot be accessed from static method
                System.out.println(y);
            }
        }
        Inner inner = new Inner();
        inner.insideInnerClass();
    }
}

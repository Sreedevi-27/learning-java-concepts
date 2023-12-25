package innerClass;

public class StaticNestedClass {
    int x = 5;
    static int y = 55;
    public static void main(String[] args) {
        NestedInsideMainClass nestedInsideMainClass = new NestedInsideMainClass();
        nestedInsideMainClass.m1();    // directly access it from outer class

        Outer1 outer1 = new Outer1();
        Outer1.Nested nested = new Outer1.Nested();
        nested.m2();
    }

    static class NestedInsideMainClass{
        static int a = 8;
        public void m1(){
            System.out.println(y);
//            System.out.println(x);   // from static class, we cannot access non-static members
            System.out.println("Static nested class inside NestedInsideMainClass");
        }
    }
}


class Outer1{
    static class Nested{
        public void m2(){
            System.out.println("Static nested class");
        }
    }
}

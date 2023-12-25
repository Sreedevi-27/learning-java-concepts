package innerClass;

// compiled using javac StaticNestedClass1.java
public class StaticNestedClass1 {
    public static void main(String[] args) {
        System.out.println("Outer class main method");
    }

    //  compiled using javac StaticNestedClass1$Nested.java
    static class Nested{
        public static void main(String[] args) {
            System.out.println("Static nested class main method");
        }
    }
}

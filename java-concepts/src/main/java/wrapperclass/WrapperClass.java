package wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {
        int num1 = 10;
        Integer integer1 = new Integer(num1);   // Boxing
        // The conversion of primitive types to the object of their corresponding wrapper classes is known as boxing.
        System.out.println(integer1);

        Integer integer2 = num1;  // Auto-boxing (boxing happening automatically)
        System.out.println(integer2);

        int num2 = integer1;   // Auto-unboxing
        //  Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing
        System.out.println(num2);
    }
}

package polymorphism;

// Method Signature means -> methodName(argument types)
// Example -> printResult(String, int)

public class MethodSignature {
    public static void main(String[] args) {

    }

    public int printResult(String name, int x){
        return 5;
    }

// In a class we can't have 2 methods with same method signature, even though the methods are having different return types
//    public float printResult(String name, int x){
//        return 5.0F;
//    }
}
package innerClass.CombinationOfClassInterface;

public class InterfaceInsideInterface {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1();

        Test2 test2 = new Test2();
        test2.m2();
    }
}

// Best example -> Map interface have Entry interface
interface OuterInterface{
    void m1();
    interface InnerInterface{
        void m2();
    }
}

// By implementing outer interface, we need to override outer interface methods. No need to override inner interface method
class Test1 implements OuterInterface{
    @Override
    public void m1() {
        System.out.println("Outer interface implementation");
    }
}

// By implementing inner interface, we need to override inner interface methods. No need to override outer interface method.
// Because the methods inside the interface is by default public and static.
class Test2 implements OuterInterface.InnerInterface{
    @Override
    public void m2() {
        System.out.println("Inner interface implementation");
    }
}
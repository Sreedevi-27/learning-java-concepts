package lambdaExpressions;

public class SimpleLambda {
    public static void main(String[] args) {
        Lambda1 l = new A();
        l.m1();

        Lambda1 l1 = ()-> System.out.println("Hii....By Lambda");
        l1.m1();
        // this lambda function provides implementation to the method m1

        Lambda2 l2 = (a, b)-> System.out.println("Sm by lambda --> "+ (a+b));
        l2.m1(5, 10);

        Lambda3 l3 = (a) -> a*a;  // by default, the value will be returned here.
        System.out.println("Square "+ l3.m1(5));


        Lambda3 l4 = (a) ->
        {
            System.out.println("Hiii....I'm square");
            return a*a;
        };
        // if we need to have a return statement explicitly, then we should use {}
        System.out.println("Square "+ l4.m1(5));
    }
}

@FunctionalInterface
interface Lambda1{
    void m1();
}

class A implements Lambda1 {
    @Override
    public void m1() {
        System.out.println("Hiiii...");
    }
}

@FunctionalInterface
interface Lambda2{
    void m1(int a, int b);
}

@FunctionalInterface
interface Lambda3{
    int m1(int a);
}




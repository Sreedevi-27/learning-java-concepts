package polymorphism.overloading;

// In overloading var-arg method will have the least priority, So if none of the method matches then only this method will be matched

public class MethodOverloading4 {
    public static void main(String[] args) {
        MethodOverloading4 methodOverloading4 = new MethodOverloading4();
        methodOverloading4.m1();
        methodOverloading4.m1(5);
    }

    public void m1(int i){
        System.out.println("One argument");
    }

    public void m1(int... i){
        System.out.println("Var argument");
    }
}


package polymorphism.overloading;

public class MethodOverloading5 {
    public static void main(String[] args) {
        MethodOverloading5 methodOverloading5 = new MethodOverloading5();
        methodOverloading5.m1(5, 5.67f);
        methodOverloading5.m1(6.89f, 9);
//        methodOverloading5.m1(8, 9); -> ambiguity
//        methodOverloading5.m1( 56.1f, 475,4f);
        
    }

    public void m1(int i, float f){
        System.out.println("int - float");
    }

    public void m1(float f, int i){
        System.out.println("float - int");
    }
}

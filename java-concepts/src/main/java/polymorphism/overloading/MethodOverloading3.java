package polymorphism.overloading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        MethodOverloading3 methodOverloading3 = new MethodOverloading3();
        methodOverloading3.m1("sree");
        methodOverloading3.m1(new StringBuffer("sree"));
      //   methodOverloading3.m1(null);
        //   -> ambiguity error. because there is no relation between string and string buffer. both are child classes of object class
    }

    public void m1(String str){
        System.out.println("String method");
    }

    public void m1(StringBuffer sb){
        System.out.println("StringBuffer method");
    }
}

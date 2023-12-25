package polymorphism.overloading;

// 2 methods are said to be overloaded when both the methods are having same name but having different argument types,
public class MethodOverloading1 {
    public static void main(String[] args) {
        MethodOverloading1 overloading = new MethodOverloading1();
        overloading.m1();
        overloading.m1(10);
        overloading.m1(46.908f);
        overloading.m1('a');  // if exact match is not present, then it goes to automatic conversion.
        // so, char is automatically converted to int
        overloading.m1(10l);
        overloading.m2("sree");
    }

    public void m1(){
        System.out.println("No argument");
    }

    public void m1(int i){
        System.out.println("int argument");
    }

    public void m1(double d){
        System.out.println("double argument");
    }

    // this method is not overloaded
    public int m1(String s){
        System.out.println("string argument");
        return 5;
    }

    public int m2(String str){
        System.out.println("String args");
        return 5;
    }

    public int m2(Object obj){
        System.out.println("String args");
        return 5;
    }
}

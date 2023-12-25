package innerClass;

//  Declaring any named class directly inside a class without a static modifier.
public class RegularClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // Outer.Inner inner = new Outer().new Inner();
        inner.m1();
        inner.getVariables();
        inner.callOuterClassMethods();

//        Inner inner1 = new Inner();   // Accessibly Inner class object directly is not possible in normal inner class
//        inner1.insideOuterClass();    // but it is possible in static nested class
    }

    class Inner{
        public void insideOuterClass(){
            System.out.println("Inner class - Inner");
        }
    }
}

// Inner classes can't have static declarations as inner classes can be accessed only with Outer class object.
class Outer{
    int common = 7;
    int a = 10;
    static int b = 15;
    class Inner{
//        public static void main(String[] args) {  }   -> Will get Compile time error because we cannot declare static methods inside inner class
        int x = 5;
        int common = 77;
        public void m1(){
            System.out.println("Inner class");
            System.out.println(x+" --- "+a+" --- "+b);
        }
        public void getVariables(){
            int common = 777;
            System.out.println(common+"---->"+ this.common + "---->"+Outer.this.common);  // this.common == Inner.common
        }

        public void callOuterClassMethods() {
            m2();  //  new Outer().m2();  both are same
            m3();  // Outer.m3();  both are same
        }
    }

    public void m2(){
        System.out.println("Outer class - non-static method");
        Inner inner1 = new Inner();    // calling inner class methods from outer class method by creating Inner class object alone
        inner1.m1();
    }

    public static void m3(){
        System.out.println("Outer class - static method");
    }
}
package objectCasting;

public class ObjectTypeCasting2 {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
        ((A)b).m1();
      //  ((A)b).m2();  -> internally, A a = new B();  a.m2();

        C c = new C();
        c.m3();
        ((B)c).m3();
        ((A)((B)c)).m3();

        System.out.println(c.x);
        System.out.println(((B)c).x);
        System.out.println(((A)((B)c)).x);
    }
}

class A{
    int x = 10;
    public void m1(){
        System.out.println("Parent");
    }

    public void m3(){
        System.out.println("A");
    }
}

class B extends A{
    int x = 20;
    public void m2(){
        System.out.println("Child");
    }

    @Override
    public void m3() {
        System.out.println("B");
    }
}

class C extends B{
    int x = 30;
    @Override
    public void m3() {
        System.out.println("C");
    }
}

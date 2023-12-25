package polymorphism.overriding;

// While overriding we can't reduce the scope of the method but we can increase the scope
// public > protected > default > private

public class Overridding4 {
}

class K{
    public void m1(){
        System.out.println("Parent class - public method");
    }

    void m2(){
        System.out.println("Parent class - protected method");
    }

    protected void m3(){
        System.out.println("Parent class - default method");
    }
}

class L extends K{
//    protected void m1(){   -> m1() is public in parent class
//    }

//    void m1(){  -> m1() is public in parent class
//    }

    protected void m2(){
        System.out.println("Child class overriding default method");
    }

//    void m3(){  -> m1() is protected in parent class
//    }
}
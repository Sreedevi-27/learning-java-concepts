package polymorphism.overriding;

import java.util.List;
import java.util.Set;

public class Overridding2 {
}

// The return type can be co-variants(from 1.5V) and is applicable only for Object types and not primitive types.
// In class D, the method m1() has the return type String, which is the child class of Object class
// But in class F, the method m1() has the return type Set, which is not the child class of List class.So it is not allowed

class C{
    public Object m1(){
        return null;
    }

    public int m2(){
        return 10;
    }
}

class D extends C{
    public String m1(){
        return "";
    }

//    public float m2(){
//        return 4.2;
//    }
}

class E{
    public List m1(){
        return null;
    }
}

class F extends E{
//    public Set m1(){   -> Error
//        return null;
//    }
}
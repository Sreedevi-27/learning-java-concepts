package objectCasting;

/*
                A b = (C) d;
1. Compile time checking:
The type ‘C’ and ‘d’ must have some relationship. i.e., C and d must have parent - child or child - parent relationship
or both the types must be the same.

2. Compile time checking:
C type must be either the same or derived(child) type of A type.

3. JVM Run time checking:
The underlying original object type of ‘d’ must be either the same or derived(child) type of C.
If not, we get ClassCastException (runtime exception)
 */

public class ObjectTypeCasting {
    public static void main(String[] args) {
        Base2 base2 = new Derived4();

        Base2 obj1 = (Base2) base2;
//        Base1 obj2 = (Derived4) base2;  --> violates rule 2
//        Base1 obj3 = (Base1) base2;     --> violates rule 1
        Derived4 obj4 = (Derived4) base2;
//        Object obj5 = (Derived3) base2;  --> violates rule 3
    }
}

class Base1{

}

class Base2{

}

class Dervied1 extends Base1{

}

class Derived2 extends Base1{

}

class Derived3 extends Base2{

}

class Derived4 extends Base2{

}
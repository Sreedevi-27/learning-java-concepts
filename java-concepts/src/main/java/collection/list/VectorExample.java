package collection.list;

import java.util.Vector;

/*
Resizable / Growable Array
Insertion Order is preserved
Duplicates are allowed
null values can be inserted
Vector contains many legacy methods that are not the part of a collections framework
Heterogeneous objects can be inserted
Implements Serializable, Clonable, RandomAccess interface
Thread safe
 */
public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        System.out.println(vector.size());
        vector.setSize(50);
        System.out.println(vector.size());

    }
}

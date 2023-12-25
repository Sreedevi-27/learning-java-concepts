package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
It is the best if your primary operation is Retrieval
Not recommended while insertion/deletion in the middle
Insertion Order is preserved
Duplicates are allowed
Null values can be inserted
Heterogeneous objects can be inserted
Implements Serializable, Clonable, RandomAccess interface
 */

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);    // add(element)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(null);
        list.add(4, 100);  // add(index, element)
        System.out.println(list);

        list.remove(2);     // remove(index)
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(5000));
        System.out.println("-------------------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(500);
        ArrayList<Integer> list1 = new ArrayList<>(vector);   // ArrayList constructor
        System.out.println(list1);
        list1.clear();          // clear() -> removes all element
        System.out.println(list1);
        list1.addAll(list);     // addAll(Collection obj)
        System.out.println("-------------------------------------");

        ArrayList list2 = new ArrayList();
        list2.add("sree");
        list2.add(2);
        list2.add(79.2);
        list2.add('s');
        System.out.println(list2);
    }
}
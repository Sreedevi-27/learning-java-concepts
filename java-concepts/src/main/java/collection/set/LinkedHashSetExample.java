package collection.set;

import java.util.LinkedHashSet;
/*
Same as Hashset, but Insertion Order is maintained
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2790);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        System.out.println(linkedHashSet);


    }
}

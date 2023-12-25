package collection.set;

/*
 Duplicates are not allowed
 Insertion order not applicable. But all the elements will be inserted in some sorted order
 Heterogenous objects are not allowed.
 Comparable objects are not allowed
 */

import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add('A');
        treeSet1.add('c');
        treeSet1.add('Z');
        treeSet1.add('c');
//        treeSet1.add(new Integer(10));  // ClassCast Exception as heterogenous objects are not allowed
        System.out.println(treeSet1);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        TreeSet treeSet2 = new TreeSet(list);    // converts into equivalent object
        System.out.println(treeSet2);

        Set sortedSet = new TreeSet();
        sortedSet.add(2);
        TreeSet treeSet3 = new TreeSet(sortedSet);
        System.out.println(treeSet3);

//        TreeSet treeSet4 = new TreeSet();
//        treeSet3.add(new StringBuffer("A"));  // the StringBuffer class does not implement Comparable.
//        treeSet3.add(new StringBuffer("Z"));  //  The object is said to be Comparable, if that particular class implements Comparable interface
//        System.out.println(treeSet4);


    }
}

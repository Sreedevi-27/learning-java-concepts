package collection.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {

        // Here, if you don't pass MyComparator object, then JVM call compareTo() method which results default sorting order
        // If it returns +ve value, obj1 should come after obj2  (+1 means, swap)
        // If it returns -ve value, obj1 should come before obj2 (-1 means, no swap)
        // If it returns 0, obj1 and obj2 are equal
        TreeSet treeSet = new TreeSet(new MyComparator());
        // Descending order
        treeSet.add(10);  // {10}
        treeSet.add(0);   // compare(0,10)  -> return +1 -> 0 should come after 10 -> {10, 0}
        treeSet.add(15);  // compare(15,10) -> return -1 -> 15 should come before 10 -> {15, 10}
        treeSet.add(5);   // compare(5,10)  -> return +1 -> 5 should come after 10 -> {10, 5} ---> take right side of tree
                          // compare(5,0)   -> return -1 -> 5 should come before 0 -> {5, 0}
        treeSet.add(20);  // compare(20,10) -> return -1 -> 20 should come before 10 -> {20, 10} -> take left side of tree
                          // compare(20,15) -> return -1 -> 20 should come before 15 -> {20, 15}
        treeSet.add(20);  // compare(20,10) -> return -1 -> 20 should come before 10 -> {20, 10} -> take left side of tree
                          // compare(20,15) -> return -1 -> 20 should come before 15 -> {20, 15}
                          // compare(20,20) -> return 0 -> no need to insert duplicate value
        System.out.println(treeSet);

        /*
       Inorder traversal -> left root right -> Ans : {20, 15, 10, 5, 0}
                        10
                       /   \
                     15     0
                    /\       /\
                   20       5

         */
    }
}

class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer integer1 = (Integer) obj1;
        Integer integer2 = (Integer) obj2;
        if(integer1 < integer2)
            return 1;
        else if(integer1 > integer2)
            return -1;
        else
            return 0;
    }
}
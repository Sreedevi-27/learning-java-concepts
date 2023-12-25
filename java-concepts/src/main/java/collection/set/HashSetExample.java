package collection.set;

import java.util.HashSet;
/*
Underlying DS - Hash table
No duplicates
Insertion Order is not maintained. Ordering will be based on HashCode of the objects
Heterogeneous objects can be inserted
null can be inserted
Not synchronized
Implements Serializable(I), Clonable(I)
Search operation, it is best
If u try to add duplicate elements, boolean add(x) will be called and it will return false

 */
public class HashSetExample{
    public static void main(String[] args) {
       HashSet<Integer> hashSet = new HashSet<>();
       hashSet.add(2790);
       hashSet.add(10);
       hashSet.add(20);
       hashSet.add(10);
       System.out.println(hashSet);

    }
}

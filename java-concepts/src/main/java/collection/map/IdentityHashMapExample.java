package collection.map;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        IdentityHashMap hashMap = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        hashMap.put(i1, "ABC");
        hashMap.put(i2, "XYZ");
        System.out.println(hashMap);  //  JVM uses == method to identify the duplicate entries  // i1 == i2
        //  == operator checks the reference type
    }
}

package collection.map;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Temp temp = new Temp();
        WeakHashMap weakHashMap = new WeakHashMap<>();
        weakHashMap.put(temp, "abcd");
        System.out.println(weakHashMap);

        temp = null;
        System.gc();    // Garbage collector can destroy the object which is associated with WeakHashMap
        // Garbage collector is called, so it will call Finalize method
        Thread.sleep(5000);
        System.out.println(weakHashMap);
    }
}

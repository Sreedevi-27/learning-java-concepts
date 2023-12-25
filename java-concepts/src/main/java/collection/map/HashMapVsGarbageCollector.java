package collection.map;

import java.util.HashMap;

public class HashMapVsGarbageCollector {
    public static void main(String[] args) throws InterruptedException {
        Temp temp = new Temp();
        HashMap hashMap = new HashMap<>();
        hashMap.put(temp, "abcd");
        System.out.println(hashMap);

        temp = null;
        System.gc();    // Garbage collector cannot destroy the object which is associated with Hash map
        // If done, Garbage collector would call Finalize method. Look at WeakHashMap example
        Thread.sleep(5000);
        System.out.println(hashMap);
    }
}

class Temp{
    public String toString(){
        return "sree";
    }

    public void finalize(){
        System.out.println("Finalize method");
    }
}
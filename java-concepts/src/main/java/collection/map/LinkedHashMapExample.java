package collection.map;

import java.util.LinkedHashMap;
/*
same as HashMap but insertion order is maintained
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap<Integer, Integer>();
        linkedHashMap.put(1, 100);
        linkedHashMap.put(5, 200);
        linkedHashMap.put(10, 600);
        linkedHashMap.put(2, 700);
        System.out.println(linkedHashMap);
    }
}

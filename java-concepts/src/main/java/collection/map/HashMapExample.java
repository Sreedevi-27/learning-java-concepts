package collection.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Sree", 27);
        map1.put("Renu", 12);
        map1.put("Sree", 10);
        System.out.println(map1);
        System.out.println(map1.put("Renu", 7));
        //If you try to enter duplicate key, then it will be updated with the new entry but returns old object value
        System.out.println(map1.get("Renu"));
        System.out.println("-------------------------------------");

        System.out.println(map1.containsKey("Sree"));
        System.out.println(map1.containsValue(27));
        System.out.println(map1.size());
        System.out.println(map1.isEmpty());
        map1.clear();
        System.out.println(map1);
        System.out.println("-------------------------------------");

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Devi", 100);
        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map1.remove("Devi"));
        System.out.println("-------------------------------------");

        Map map3 = new HashMap();
        map3.put("ABC", 123);
        map3.put("XYZ", 789);
        Set set = map3.keySet();
        Collection collection = map3.values();
        System.out.println(set);
        System.out.println(collection);
        Set set1 = map3.entrySet();
        System.out.println(set1);
        System.out.println("-------------------------------------");

        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            Map.Entry m1 = (Map.Entry) iterator.next();
            System.out.println(m1.getKey() + "-------"+ m1.getValue());
        }
        System.out.println("-------------------------------------");

        HashMap hashMap = new HashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        hashMap.put(i1, "ABC");
        hashMap.put(i2, "XYZ");
        System.out.println(hashMap);  //  JVM uses .equals() method to identify the duplicate entries  // i1.equals(i2)
    }
}

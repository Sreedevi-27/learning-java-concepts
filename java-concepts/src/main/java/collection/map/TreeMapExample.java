package collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        SortedMap sortedMap = new TreeMap();
        sortedMap.put(101, "ABC");
        sortedMap.put(125, "LJS");
        sortedMap.put(106, "HKA");
        sortedMap.put(192, "TAM");
        sortedMap.put(158, "XYZ");
     //   sortedMap.put('a', "efr");   // heterogenous keys - not allowed
     //   sortedMap.put(null, "rhii");   // Null values cannot be inserted to non-empty map
        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(106));
        System.out.println(sortedMap.tailMap(158));
        System.out.println(sortedMap.subMap(106,158));
        System.out.println(sortedMap.headMap(102));

//        SortedMap sortedMap1 = new TreeMap();
//        sortedMap1.put(null, "hijor");
//        System.out.println(sortedMap1);
    }
}

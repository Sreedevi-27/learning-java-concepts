package collection.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("d", "dog");
        navigableMap.put("s", "sit");
        navigableMap.put("y", "yellow");
        navigableMap.put("a", "apple");
        navigableMap.put("k", "king");
        System.out.println(navigableMap);  // default sorting order based on keys

        System.out.println(navigableMap.floorKey("d"));
        System.out.println(navigableMap.lowerKey("c"));
        System.out.println(navigableMap.ceilingEntry("s"));
        System.out.println(navigableMap.higherKey("s"));
        System.out.println(navigableMap.pollFirstEntry());
        System.out.println(navigableMap.pollLastEntry());
        System.out.println(navigableMap.descendingMap());
        System.out.println(navigableMap);
    }
}

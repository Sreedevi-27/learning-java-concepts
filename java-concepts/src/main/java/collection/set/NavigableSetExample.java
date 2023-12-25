package collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);
        System.out.println(navigableSet);
        System.out.println(navigableSet.floor(20));
        System.out.println(navigableSet.lower(20));
        System.out.println(navigableSet.ceiling(30));
        System.out.println(navigableSet.higher(30));
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet.descendingSet());
        System.out.println(navigableSet);
    }
}

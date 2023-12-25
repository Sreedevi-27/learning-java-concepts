package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchingElementsInList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(70);
        list.add(90);
        list.add(20);
        list.add(80);
        list.add(30);
        System.out.println(list);
        Collections.sort(list);   // default sorting order
        System.out.println(list);
        /*
         -1  -2  -3  -4  -5   -> insertion point -> on unsuccessful search
         [20, 30, 70, 80, 9]
          0   1   2   3   4   -> index -> on unsuccessful search
         */
        System.out.println(Collections.binarySearch(list, 30));
        System.out.println(Collections.binarySearch(list, 40));

        System.out.println("-------------------------------------");

        List list1 = new ArrayList();
        list1.add(70);
        list1.add(90);
        list1.add(20);
        list1.add(80);
        list1.add(30);
        System.out.println(list1);
        Collections.sort(list1, new MyComparator());   // customized sorting order
        System.out.println(list1);
        /*
         -1  -2  -3  -4  -5   -> insertion point -> on unsuccessful search
         [90, 80, 70, 30, 20]
          0   1   2   3   4   -> index -> on unsuccessful search
         */
        System.out.println(Collections.binarySearch(list1, 30, new MyComparator()));
        System.out.println(Collections.binarySearch(list1, 60, new MyComparator()));
        System.out.println(Collections.binarySearch(list1, 60));   // unpredictable answer

    }
}

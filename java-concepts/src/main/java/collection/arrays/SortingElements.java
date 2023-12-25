package collection.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SortingElements {
    public static void main(String[] args) {
        int[] arr = {7, 80, 28, 102, 53};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------");

        String[] stringArray = {"X", "G", "A", "L"};
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        System.out.println("-------------------------------------");

        String[] stringArray1 = {"X", "G", "A", "L"};
        System.out.println(Arrays.toString(stringArray1));
        Arrays.sort(stringArray1, new MyComparator());
        System.out.println(Arrays.toString(stringArray1));
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        String str1 = obj1.toString();
        String str2 = obj2.toString();
        return str2.compareTo(str1);
    }
}


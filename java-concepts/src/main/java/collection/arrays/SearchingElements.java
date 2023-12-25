package collection.arrays;

import java.util.Arrays;

public class SearchingElements {
    public static void main(String[] args) {
        int[] arr = {7, 80, 28, 102, 53};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        /*
             -1  -2  -3  -4  -5   -> insertion point -> on unsuccessful search
             [7, 28, 53, 80, 102]
              0   1   2   3   4   -> index -> on unsuccessful search
         */
        System.out.println(Arrays.binarySearch(arr, 53));
        System.out.println(Arrays.binarySearch(arr, 10));

        System.out.println("-------------------------------------");

        String[] stringArray = {"X", "G", "A", "L"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
         /*
             -1 -2 -3 -4    -> insertion point -> on unsuccessful search
             [A, G, L, X]
              0  1  2  3     -> index -> on unsuccessful search
         */
        System.out.println(Arrays.binarySearch(stringArray, "G"));
        System.out.println(Arrays.binarySearch(stringArray, "M"));

        System.out.println("-------------------------------------");

        String[] stringArray1 = {"X", "G", "A", "L"};
        Arrays.sort(stringArray1, new MyComparator());
        System.out.println(Arrays.toString(stringArray1));
         /*
             -1 -2 -3 -4    -> insertion point -> on unsuccessful search
             [X, L, G, A]
              0  1  2  3     -> index -> on unsuccessful search
         */
        System.out.println(Arrays.binarySearch(stringArray1, "G", new MyComparator()));
        System.out.println(Arrays.binarySearch(stringArray1, "M", new MyComparator()));
        System.out.println(Arrays.binarySearch(stringArray1, "M"));  // unexpected result
    }
}

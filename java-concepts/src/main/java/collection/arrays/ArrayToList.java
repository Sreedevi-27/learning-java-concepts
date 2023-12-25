package collection.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        Integer[] arr1 = list1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1));

        List<Integer> list2 = Arrays.asList(arr1);   // This method does not create an independent List.
                // The newly created reference list2 can be used to view to the existing array as List type
        System.out.println(list2);

        arr1[0] = 50;
        System.out.println(list2);
//        list2.add(80);  list.remove(1); -> UnsupportedOperationException(runtime)
        // because, internally it is array, not List
        list2.set(1, 90);  // set method is allowed because it doesn't change the array size
        System.out.println(Arrays.toString(arr1));

//        list2.set(1, new Integer(798));  -> not allowed to set the heterogenoys objects. ArrayStoreException
    }
}

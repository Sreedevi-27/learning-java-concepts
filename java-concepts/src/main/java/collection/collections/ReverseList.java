package collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(90);
        list.add(20);
        list.add(80);
        list.add(30);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

       Integer[] arr = {70, 90, 20, 80, 30};
       Arrays.sort(arr, Collections.reverseOrder());
       System.out.println(Arrays.toString(arr));
    }
}

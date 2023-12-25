package collection.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(70);
        arrayList.add(20);
        arrayList.add(50);
        arrayList.add(10);
        arrayList.add(30);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("-------------------------------------");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(70);
        arrayList1.add(20);
        arrayList1.add(50);
        arrayList1.add(10);
        arrayList1.add(30);
        System.out.println(arrayList1);
        Collections.sort(arrayList1, new MyComparator());
        System.out.println(arrayList1);
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer integer1 = (Integer) obj1;
        Integer integer2 = (Integer) obj2;
        if(integer1 < integer2)
            return 1;
        else if(integer1 > integer2)
            return -1;
        else
            return 0;
    }
}


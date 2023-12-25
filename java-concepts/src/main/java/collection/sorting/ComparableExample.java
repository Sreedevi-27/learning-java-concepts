package collection.sorting;

import java.util.ArrayList;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(20);
        al.add(3);

    }
}

class MyComparable implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


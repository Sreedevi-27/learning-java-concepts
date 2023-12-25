package collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;

/*
i) Read and remove operations can be done
ii) Can be used to any of the collection classes
 */

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<10; i++)
            arrayList.add(i);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            if(integer%2 == 0)
                System.out.println("Even - "+integer);
            else
                iterator.remove();
        }
    }
}

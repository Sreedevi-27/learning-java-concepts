package collection.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

/*
i) Bidirectional cursor
ii) Read, remove, replacement, addition of new objects operations can be performed
iii) Applicable only for List implemented class objects and it not a universal cursor
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(80);
        linkedList.add(77);
        linkedList.add(27);
        linkedList.add(54);
        linkedList.add(60);
        System.out.println(linkedList);
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            Integer integer = (Integer) listIterator.next();
            if(integer%10 == 0)
                listIterator.add(10);
            else if(integer%11 == 0)
                listIterator.remove();
            else if(integer%3 == 0)
                listIterator.set(3);
        }
        System.out.println(linkedList);
    }
}

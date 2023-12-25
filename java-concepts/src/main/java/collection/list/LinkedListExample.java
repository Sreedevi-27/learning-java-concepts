package collection.list;

import java.util.LinkedList;
import java.util.Stack;

/*
Best choice in inserting and deleting a element in middle
Worst choice if your primary operation is Retrieval
Doubly linked list
Insertion Order is preserved
Duplicates are allowed
null values can be inserted
Heterogeneous objects can be inserted
Implements Serializable, Clonable interface. Not RandomAccess interface

 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        System.out.println(list);
        System.out.println("-------------------------------------");

        list.addFirst(1);
        list.addLast(100);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println("-------------------------------------");

        System.out.println("POLL and REMOVE");
        LinkedList<Integer> list1 = new LinkedList<>();
        System.out.println(list1.poll()); //  remove and return head element of the queue. If queue is empty, it returns empty
       //  System.out.println(list1.remove()); //  remove and return head element of the queue. If queue is empty, it throws NoSuchElementException
        list1.add(101);
        list1.add(102);
        list1.add(103);
        list1.add(104);
        list1.add(105);
        System.out.println(list1);
        System.out.println(list1.poll());  // prints head of the element and removes it from list
        System.out.println(list1);
        System.out.println(list1.remove());  // prints head of the element and removes it from list
        System.out.println(list1);

        System.out.println("-------------------------------------");
        System.out.println("PEEK and ELEMENT");
        System.out.println(list1.peek());  // prints head of the element and does not remove it from list
        System.out.println(list1.element()); // prints head of the element and does not remove it from list
        System.out.println(list1);
        list1.removeAll(list1);
        System.out.println(list1);
        System.out.println(list1.peek());   // returns head of the queue but doesn't remove. If empty, returns null
//        System.out.println(list1.element());  // returns head of the queue but doesn't remove. If empty, throws NoSuchElement Exception
    }
}

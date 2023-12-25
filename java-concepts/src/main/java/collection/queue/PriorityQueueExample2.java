package collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(15, new MyComparator());
        priorityQueue.offer("A");
        priorityQueue.offer("X");
        priorityQueue.offer("N");
        priorityQueue.offer("C");
        System.out.println(priorityQueue);

        PriorityQueue priorityQueue1 = new PriorityQueue();
        priorityQueue1.offer("A");
        priorityQueue1.offer("X");
        priorityQueue1.offer("N");
        priorityQueue1.offer("C");
        System.out.println(priorityQueue1);
    }
}

class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = (String) o1;
        String str2 = (String) o2;
        return str2.compareTo(str1);
    }
}
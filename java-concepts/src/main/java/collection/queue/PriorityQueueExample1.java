package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.element());  -> NoSuchElement exception as the Queue is empty
//        System.out.println(priorityQueue.remove());   -> NoSuchElement exception as the Queue is empty
        for(int i=0; i<10; i++)
            priorityQueue.offer(i);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
    }
}

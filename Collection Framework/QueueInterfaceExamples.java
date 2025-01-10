
import java.util.*;

public class QueueInterfaceExamples {
    
    static void QueueExamples(){
        // Queue is an interface, so we can't instantiate it
        // We can use LinkedList or PriorityQueue
        // LinkedList is a class that implements Queue
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(3);
        q.offer(5);
        q.offer(8);
        System.out.println(q); // 3, 5, 8
        System.out.println(q.peek()); // 3
        System.out.println(q.poll()); // 3 removed
        System.out.println(q); // 5, 8
        System.out.println(q.peek()); // 5
    }

    static void MinPriorityQueueExamples(){
        // PriorityQueue is a class that implements Queue
        // It orders the elements in the queue
        // based on their natural order or a Comparator
        PriorityQueue<Integer> q = new PriorityQueue<>(); // min priority queue
        q.add(10);
        q.add(5);
        q.add(7);
        System.out.println(q); // 5, 10, 7 - 5 has higher priority because it's smaller
        System.out.println(q.peek()); // 5
        System.out.println(q.poll()); // 5 removed
        System.out.println(q); // 7, 10 - 7 has higher priority because it was added first
    }

    static void MaxPriorityQueueExamples(){
        // We can use a Comparator to reverse the order
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder()); // max priority queue
        q.add(10);
        q.add(5);
        q.add(7);
        System.out.println(q); // 10, 5, 7 - 10 has higher priority because it's bigger
        System.out.println(q.peek()); // 10
        System.out.println(q.poll()); // 10 removed
        System.out.println(q); // 7, 5 - 7 has higher priority because it was added first
    }

    static void DequeExamples(){
        // Deque is an interface, so we can't instantiate it
        // We can use ArrayDeque
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(3);
        dq.addLast(5);
        dq.addFirst(8);
        System.out.println(dq); // 8, 3, 5
        System.out.println(dq.peekFirst()); // 8
        System.out.println(dq.peekLast()); // 5
        System.out.println(dq.pollFirst()); // 8 removed
        System.out.println(dq); // 3, 5
    }

    public static void main(String[] args) {
        QueueExamples();
        MinPriorityQueueExamples();
        MaxPriorityQueueExamples();
        DequeExamples();
    }
}

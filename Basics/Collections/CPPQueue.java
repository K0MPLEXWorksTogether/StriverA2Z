package Basics.Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class CPPQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        // Enqueue
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);

        // Iteration
        Iterator<Integer> iter = q.iterator();
        System.out.printf("Queue: ");
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.println();

        // Inclusion
        System.out.println("Queue contains 1: " + q.contains(1));

        // Peeking
        System.out.println("Peeking Start: " + q.peekFirst());
        System.out.println("Peeking End: " + q.peekLast());

        // No updation in a queue.
        // Dequeue
        q.removeFirst();

        // Size
        System.out.println("Size: " + q.size());

        // Truncate
        q.clear();
    }
}

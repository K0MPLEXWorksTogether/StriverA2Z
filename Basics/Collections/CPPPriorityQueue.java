package Basics.Collections;

import java.util.PriorityQueue;

public class CPPPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // Inclusion
        heap.offer(30);
        heap.offer(10);
        heap.offer(50);
        heap.offer(20);

        // Peeking
        System.out.println("Top element (max): " + heap.peek());

        // Iteration
        System.out.println("Elements (iteration is unordered):");
        for (int val : heap) {
            System.out.println(val);
        }

        // No update in priority queue.

        // Delete
        heap.poll();

        // Size
        System.out.println("Queue size: " + heap.size());

        // Truncation
        heap.clear();
    }
}

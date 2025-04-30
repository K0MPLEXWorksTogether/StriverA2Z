package Basics.Collections;

import java.util.ArrayDeque;

public class CPPDeque {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Insertion (Front And Back)
        deque.addFirst("Front1");
        deque.addLast("Back1");
        deque.addFirst("Front2");
        deque.addLast("Back2");

        // Peeking
        System.out.println("Front: " + deque.peekFirst());
        System.out.println("Back: " + deque.peekLast());

        // Iteration
        System.out.println("Deque contents:");
        for (String item : deque) {
            System.out.println(item);
        }

        // No update for a deque
        // Pop
        deque.removeFirst();
        deque.removeLast();

        // Size
        System.out.println("Deque size: " + deque.size());

        // Truncation
        deque.clear();
    }
}

package Basics.Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class CPPStack {
    public static void main(String[] args) {
        ArrayDeque<String> myStack = new ArrayDeque<>();

        // Push
        myStack.addFirst("Apple");
        myStack.addFirst("Orange");
        myStack.addFirst("Mango");

        // Inclusion
        System.out.println("Stack has 'Apple': " + myStack.contains("Apple"));

        // Iteration
        Iterator<String> iter = myStack.iterator();
        System.out.printf("Stack: ");
        while (iter.hasNext()) {
            System.out.printf("%s ", iter.next());
        }
        System.out.println();

        // Peeking
        System.out.println("Peeking: " + myStack.peekFirst());

        // Pop
        myStack.removeFirst();

        // Size
        System.out.println("Size: " + myStack.size());

        // Truncate
        myStack.clear();
    }
}

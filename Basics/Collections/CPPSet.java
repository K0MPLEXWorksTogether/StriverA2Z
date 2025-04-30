package Basics.Collections;

import java.util.TreeSet;
import java.util.Iterator;

public class CPPSet {
    public static void main(String[] args) {
        TreeSet<Integer> mySet = new TreeSet<>();

        // Inserting
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        // Inclusion
        System.out.println("Set contains 10: " + mySet.contains(10));

        // Iteration
        Iterator<Integer> iter = mySet.iterator();
        System.out.printf("Set: ");
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        System.out.println();

        // No updation in a set.
        // Deletion
        mySet.remove(3);

        // Size
        System.out.println("Size: " + mySet.size());

        // Truncate
        mySet.clear();
    }
}

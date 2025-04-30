package Basics.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class CPPUnorderedSet {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<String>();

        // Inserting
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");

        // Inclusion
        System.out.println("Is 'Banana' in the set: " + mySet.contains("Banana"));

        // Reading Values
        Iterator<String> iterator = mySet.iterator();
        System.out.printf("Set: ");
        while (iterator.hasNext()) {
            System.out.printf("%s ", iterator.next());
        }
        System.out.println();

        // Deleting
        mySet.remove("Banana");
        System.out.println("Deleted Banana");

        // No update operations in set.
        // Size
        System.out.println("Size Of Set: " + mySet.size());

        // Clear
        mySet.clear();
        System.out.println("Set Cleared. Size: " + mySet.size());
    }
}

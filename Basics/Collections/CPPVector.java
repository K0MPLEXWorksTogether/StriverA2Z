package Basics.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CPPVector {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        // Inserting
        myList.add("Red");
        myList.add("Green");
        myList.add("Blue");

        // Reading At Index
        System.out.println("Element at index 1: " + myList.get(1));

        // Iterating
        Iterator<String> iterator = myList.iterator();
        System.out.printf("List: ");
        while (iterator.hasNext()) {
            System.out.printf("%s ", iterator.next());
        }
        System.out.println();

        // Updation
        myList.set(1, "Yellow");

        // Delete By Index
        myList.remove(0);

        // Delete By Value
        myList.remove("Yellow");

        // Size;
        System.out.println("Size: " + myList.size());

        // Truncation;
        myList.clear();
    }
}

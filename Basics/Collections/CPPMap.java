package Basics.Collections;

import java.util.TreeMap;
import java.util.Map;

public class CPPMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap = new TreeMap<>();
        
        // Inserting
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        myMap.put("cherry", 30);

        // Inclusion
        System.out.println("Map contains 'apple': " + myMap.containsKey("apple"));
        System.out.println("Map contains 20: " + myMap.containsValue(20));

        // Reading Via Key
        System.out.println("Value for 'apple': " + myMap.get("apple"));

        // Iterating
        System.out.println("All elements in the map:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Updating Via Key
        myMap.put("banana", 25);

        // Delete by key
        myMap.remove("cherry");

        // Size
        System.out.println("Map size: " + myMap.size());

        // Truncate
        myMap.clear();
        System.out.println("Map cleared. Size now: " + myMap.size());
    }
}

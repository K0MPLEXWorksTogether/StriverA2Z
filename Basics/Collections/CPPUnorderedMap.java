package Basics.Collections;

import java.util.HashMap;
import java.util.Map;

public class CPPUnorderedMap {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        // Insertion
        myMap.put("cat", 4);
        myMap.put("spider", 8);
        myMap.put("human", 2);

        // Inclusion
        System.out.println("Map Contains 'cat': " + myMap.containsKey("cat"));
        System.out.println("Map Contains '4': " + myMap.containsValue(4));

        // Iteration
        System.out.println("All entries in the map:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Updation
        myMap.put("human", 2 + 2);

        // Delete by key
        myMap.remove("spider");

        // Size
        System.out.println("Map size: " + myMap.size());

        // Truncate
        myMap.clear();
        System.out.println("Map cleared. Size now: " + myMap.size());
    }
}

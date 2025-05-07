package Basics.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequency {
    public int highestFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int highest = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
            }
        }

        return highest;
    }
    
    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 2, 1, 3, 4, 1, 2 };
        HighestFrequency test = new HighestFrequency();
        
        System.out.println(test.highestFrequency(array));
    }
}

package Basics.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public HashMap<Integer, Integer> frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        Frequency test = new Frequency();
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        HashMap<Integer, Integer> freq = test.frequency(array);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.printf("%d - %d\n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }
}

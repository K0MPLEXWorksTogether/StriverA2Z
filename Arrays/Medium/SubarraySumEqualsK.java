package Arrays.Medium;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int countSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int complement = sum - k;
            count += map.getOrDefault(complement, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

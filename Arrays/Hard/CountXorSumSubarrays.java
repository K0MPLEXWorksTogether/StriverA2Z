package Arrays.Hard;

import java.util.HashMap;

public class CountXorSumSubarrays {
    public int countXorSumSubarrays(int[] nums, int target) {
        int count = 0;
        int xorSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xorSum, 1);
        
        for (int i = 0; i < nums.length; i++) {
            xorSum ^= nums[i];
            int x = xorSum ^ target;
            if (map.containsKey(x)) {
                count++;
            }

            if (map.containsKey(xorSum)) {
                map.put(xorSum, map.get(xorSum) + 1);
            } else {
                map.put(xorSum, 1);
            }
        }


        return count;
    }
}

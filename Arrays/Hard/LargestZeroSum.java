package Arrays.Hard;

import java.util.HashMap;

public class LargestZeroSum {
    public int largestZeroSum(int[] nums){
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                max = Math.max(max, i + 1);
            } else if (map.get(sum) != null) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }
}

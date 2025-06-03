package Arrays.Easy;

import java.util.HashMap;

public class LongestSubarraySumEqualsK {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0;
        int sum = 0;
        int maxLen = 0;

        while (right < n) {
            if (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n)
                sum += arr[right];
        }

        return maxLen;
    }

    public static int longestSubarray2(int[] arr, int k) {
        int maxLen = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}

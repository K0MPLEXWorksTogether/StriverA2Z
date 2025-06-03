package Arrays.Medium;

public class KadanesAlgorithm {
    public static int maximumSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = Integer.MIN_VALUE;

        for (int i : arr) {
            if (currSum < 0) {
                currSum = 0;
            }

            currSum += i;
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}

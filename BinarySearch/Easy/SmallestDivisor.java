package BinarySearch.Easy;

public class SmallestDivisor {
    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(num, max);
        }
        return max;
    }

    public static int divisorSum(int[] arr, int divisor){
        int sum = 0;
        for (int num : arr) {
            sum += Math.ceil((float) num / divisor);
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int max = maximum(nums);
        int left = 1;
        int right = max;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = divisorSum(nums, mid);
            if (sum <= threshold) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

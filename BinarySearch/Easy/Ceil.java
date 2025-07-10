package BinarySearch.Easy;

public class Ceil {
    public static int ceil(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ceil = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                ceil = nums[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ceil;
    }
}

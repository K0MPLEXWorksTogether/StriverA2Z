package BinarySearch.Easy;

public class RotatedSortedMin {
    public int rotatedSortedMin(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] <= nums[mid]) {
                ans = Math.min(ans, nums[left]);
                left = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                right = mid - 1;
            }
        }

        return ans;
    }
}

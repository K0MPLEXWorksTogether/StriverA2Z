package BinarySearch.Easy;

public class CountRotations {
    public int countRotations(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int minIndex = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= nums[minIndex]) {
                    minIndex = left;
                }
                left = mid + 1;
            } else {
                if (nums[mid] <= nums[minIndex]) {
                    minIndex = mid;
                    right = mid - 1;
                }
            }
        }

        return minIndex;
    }
}

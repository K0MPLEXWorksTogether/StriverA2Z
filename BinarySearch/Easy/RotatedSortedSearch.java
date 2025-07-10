package BinarySearch.Easy;

public class RotatedSortedSearch {
    public static int rotatedSortedSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                ans = mid;
                return ans;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] test = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int testTarget = 0;
        System.out.println(rotatedSortedSearch(test, testTarget));
    }
}

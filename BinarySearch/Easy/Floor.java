package BinarySearch.Easy;

public class Floor {
    public static int floor(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                floor = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return floor;
    }

    public static void main(String[] args) {
        int[] test = { 3, 4, 4, 7, 8, 10 };
        int testTarget = 8;

        System.out.println("Floor: " + floor(test, testTarget));
    }
}

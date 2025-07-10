package BinarySearch.Medium;

public class SearchIn2DMatrix {
    public boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int row = 0;

        for (int i = 0; i < m; i++) {
            int firstValue = matrix[i][0];
            int lastValue = matrix[i][n];

            if (target >= firstValue && target <= lastValue) {
                row = i;
                break;
            }
        }

        return binarySearch(matrix[row], target);
    }
}

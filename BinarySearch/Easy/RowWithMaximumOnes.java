package BinarySearch.Easy;

public class RowWithMaximumOnes {
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static int rowWithMaximumOnes(int[][] matrix) {
        int maxOnes = 0;
        for (int i = 0; i < matrix.length; i++) {
            int[] row = new int[matrix[0].length];
            for (int j = 0; j < matrix[0].length; j++) {
                row[j] = matrix[i][j];
            }
            maxOnes = Math.max(matrix[0].length - findFirstOccurrence(row, 1), maxOnes);
        }
        return maxOnes;
    }
}

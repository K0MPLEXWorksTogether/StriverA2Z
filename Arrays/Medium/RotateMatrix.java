package Arrays.Medium;

public class RotateMatrix {
    private static void swap(int[][] matrix, int i, int j, int p, int q) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[p][q];
        matrix[p][q] = temp;
    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i > j) {
                    swap(matrix, i, j, j, i);
                }
            }
        }
    }
    
    private static void reverse(int[][] matrix, int i) {
        int left = 0, right = matrix[0].length - 1;
        while (left <= right) {
            swap(matrix, i, left, i, right);
        }
    }
    public static void rotateMatrix(int[][] matrix) {
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix, i);
        }
    }
}
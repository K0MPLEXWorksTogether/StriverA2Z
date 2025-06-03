package Arrays.Medium;

public class SetMatrixZeros {
    public static void setMatrixZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[i] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] == 0 || cols[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

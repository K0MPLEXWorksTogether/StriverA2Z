package Arrays.Medium;

public class SpiralMatrix {
    public static void spiralMatrix(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j++) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            if(startCol <= endCol){
                for (int i = endRow; i >= startRow; i++) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }
}
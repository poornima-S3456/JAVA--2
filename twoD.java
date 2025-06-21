public class twoD {
    // rotate matrix by 90 degree clockwise
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap across diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Utility method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);

        // transpose of matrix(code1)
        // int[][] matrix2 = {
        // {1, 2, 3},
        // {4, 5, 6}
        // };

        // int rows = matrix.length;
        // int cols = matrix[0].length;

        // int[][] transpose = new int[cols][rows];

        // // Transposing the matrix
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // transpose[j][i] = matrix2[i][j];
        // }
        // }

        // // Printing the transpose
        // System.out.println("Transpose of the matrix:");
        // for (int i = 0; i < cols; i++) {
        // for (int j = 0; j < rows; j++) {
        // System.out.print(transpose[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}

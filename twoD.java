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

    // search in row wise and column wise
    public static int[] searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = cols - 1; // start from top-right

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return new int[] { i, j }; // found
            } else if (matrix[i][j] > target) {
                j--; // move left
            } else {
                i++; // move down
            }
        }

        return new int[] { -1, -1 }; // not found
    }


 




    public static void main(String[] args) {
          
          //matrix multiplication
        // int[][] A = {
        //     {1, 2, 3},
        //     {4, 5, 6}
        // };
        // int[][] B = {
        //     {7, 8},
        //     {9, 10},
        //     {11, 12}
        // };
        // int m = A.length;
        // int n = A[0].length;
        // int p = B[0].length;
        // int[][] result = new int[m][p];

        // // Matrix multiplication logic
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < p; j++) {
        //         for (int k = 0; k < n; k++) {
        //             result[i][j] += A[i][k] * B[k][j];
        //         }
        //     }
        // }
        // // Print Result
        // System.out.println("Resultant Matrix:");
        // for (int[] row : result) {
        //     for (int val : row) {
        //         System.out.print(val + " ");
        //     }
        //     System.out.println();
        // }




        // int[][] matrix = {
        //         { 10, 20, 30, 40 },
        //         { 15, 25, 35, 45 },
        //         { 27, 29, 37, 48 },
        //         { 32, 33, 39, 50 }
        // };

        // int target = 29;
        // int[] result2 = searchMatrix(matrix, target);

        // if (result2[0] != -1) {
        //     System.out.println("Found at: (" + result[0] + ", " + result[1] + ")");
        // } else {
        //     System.out.println("Element not found");
        // }

        // int[][] matrix= {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // System.out.println("Original Matrix:");
        // printMatrix(matrix);

        // rotate(matrix);

        // System.out.println("Rotated Matrix (90 degrees clockwise):");
        // printMatrix(matrix);

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

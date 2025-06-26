public class semple {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from top-right corner
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // found
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }
        return false; // not found
    }



    //snake pattern
    public static void printSnakePattern(int[][] matrix) {
        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Left to Right
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Right to Left
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }


    //code lll
      public static void modifyMatrix(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        
        boolean[] row = new boolean[R];
        boolean[] col = new boolean[C];

        // Step 1: Store the rows and columns that need to be updated
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            } }
        // Step 2: Update the matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }   }    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }      

    public static void main(String[] args) {
 int[][] mat = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Original Matrix:");
        printMatrix(mat);

        modifyMatrix(mat);

        System.out.println("Modified Matrix:");
        printMatrix(mat);



        //  int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // System.out.println("Snake Pattern:");
        // printSnakePattern(matrix);








        // int[][] matrix1 = {
        //     {1, 4, 7, 11},
        //     {2, 5, 8, 12},
        //     {3, 6, 9, 16},
        //     {10, 13, 14, 17}
        // };

        // int target = 9;

        // boolean result = searchMatrix(matrix, target);
        // System.out.println("Target found: " + result);
    }
}

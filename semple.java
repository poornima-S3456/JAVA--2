import java.util.Stack;

public class semple {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;

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

    // snake pattern
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

    // code lll
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
            }
        }
        // Step 2: Update the matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    //code112
    public static int maxRectangle(int[][] matrix) {
        int maxArea = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Traverse each cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // If current cell is 1, check all rectangles starting from it
                if (matrix[i][j] == 1) {
                    int width = cols;

                    // Go down row by row
                    for (int k = i; k < rows && matrix[k][j] == 1; k++) {
                        int tempWidth = 0;

                        // Count width of 1s in current row
                        for (int l = j; l < width; l++) {
                            if (matrix[k][l] == 1) {
                                tempWidth++;
                            } else {
                                break;
                            }
                        }

                        // Update width and area
                        width = tempWidth;
                        int height = k - i + 1;
                        int area = width * height;
                        maxArea = Math.max(maxArea, area);
                    }
                }    }    }

        return maxArea;
    }     

      public static void main(String[] args) {

        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };

        System.out.println("Maximum rectangle area: " + maxRectangle(matrix));
   

        
        // int[][] mat = {
        // {1, 0, 0},
        // {0, 0, 0},
        // {0, 0, 0}
        // };
        // System.out.println("Original Matrix:");
        // printMatrix(mat);

        // modifyMatrix(mat);

        // System.out.println("Modified Matrix:");
        // printMatrix(mat);

        // int[][] matrix = {
        // {1, 2, 3},
        // {4, 5, 6},
        // {7, 8, 9}
        // };

        // System.out.println("Snake Pattern:");
        // printSnakePattern(matrix);

        // int[][] matrix1 = {
        // {1, 4, 7, 11},
        // {2, 5, 8, 12},
        // {3, 6, 9, 16},
        // {10, 13, 14, 17}
        // };

        // int target = 9;

        // boolean result = searchMatrix(matrix, target);
        // System.out.println("Target found: " + result);
    }
}

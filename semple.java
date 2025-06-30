import java.util.Stack;

public class semple {
    public static boolean search(int[][] matrix, int target) {
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


    //code113
     public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++; // One complete island explored
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        int rows = grid.length, cols = grid[0].length;

        // Check for out of bounds or water
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }

        // Mark the current land as visited
        grid[i][j] = '0';

        // Visit all 4 directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }  

    //boundry traversal of matrix
    public static void boundaryTraversal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Step 1: Top row
        for (int i = 0; i < cols; i++) {
            System.out.print(matrix[0][i] + " ");
        }
        // Step 2: Right column
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }
        // Step 3: Bottom row (only if more than one row)
        if (rows > 1) {
            for (int i = cols - 2; i >= 0; i--) {
                System.out.print(matrix[rows - 1][i] + " ");
            }
        }
        // Step 4: Left column (only if more than one column)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    } 
    
    // staircase search
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1; // Start at top-right

        while (row < matrix.length && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return true;
            } else if (current > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false; // Target not found
    }
     
      public static void main(String[] args) {
int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;

        if (searchMatrix(matrix, target)) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }

   




        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        // boundaryTraversal(matrix);
   
         





        //   semple obj = new semple();
        // char[][] grid = {
        //     {'1','1','0','0','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','1','0','0'},
        //     {'0','0','0','1','1'}
        // };
        // System.out.println("Number of islands: " + obj.numIslands(grid)); // Output: 3
  
         





        // int[][] matrix = {
        //     {1, 0, 1, 0, 0},
        //     {1, 0, 1, 1, 1},
        //     {1, 1, 1, 1, 1},
        //     {1, 0, 0, 1, 0}
        // };

        // System.out.println("Maximum rectangle area: " + maxRectangle(matrix));
   

        
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

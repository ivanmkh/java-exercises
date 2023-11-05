// Write a Java program to find the minimum path sum in a 2D grid.
// Path from top left to bottom in the right direction which
// minimizes the sum of all numbers along its path.
// Note: Move either down or right at any point in time.
// Sample Output: Sum of all numbers along its path: 13
public class Main {
    public static final int GRID_DIMENSION = 10;

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("\nDESCRIPTION: The task is to find the minimum path sum in a 2D grid.\n" +
                "Path from top left to bottom in the right direction which\n" +
                "minimizes the sum of all numbers along its path.\n");

        int[][] grid = new int[GRID_DIMENSION][GRID_DIMENSION];
        for (int i = 0; i < GRID_DIMENSION; i++) {
            for (int j = 0; j < GRID_DIMENSION; j++) {
                grid[i][j] = (int) Math.round(Math.random() * 9);
            }
        }

        System.out.println("\nGiven grid:");
        for (int i = 0; i < GRID_DIMENSION; i++) {
            for (int j = 0; j < GRID_DIMENSION; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("\nSum of all numbers along its path: %s\n", minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) throws InterruptedException {
        // Check for invalid or empty input grid
        if (grid == null || GRID_DIMENSION == 0) {
            return 0;
        }
        int m = GRID_DIMENSION; // Number of rows in the grid
        int n = GRID_DIMENSION; // Number of columns in the grid
        int[][] calculatedSumsGrid = new int[m][n]; // Temporary array to store minimum path sum

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    calculatedSumsGrid[i][j] = grid[i][j]; // Initialize the starting point
                    continue;
                }

                // Calculate the minimum path sum from either the cell above or the cell on the left
                int from_up = i == 0 ? Integer.MAX_VALUE : calculatedSumsGrid[i - 1][j];
                int from_left = j == 0 ? Integer.MAX_VALUE : calculatedSumsGrid[i][j - 1];
                calculatedSumsGrid[i][j] = Math.min(from_up, from_left) + grid[i][j]; // Update the temporary array
            }
        }

        showMinimalPath(grid, calculatedSumsGrid);

        // Return the minimum path sum for the last cell
        return calculatedSumsGrid[m - 1][n - 1];
    }

    public static void showMinimalPath(int[][] originalGrid, int[][] calculatedSumsGrid) throws InterruptedException {
        // starting from right bottom corner
        int row = GRID_DIMENSION - 1;
        int column = GRID_DIMENSION - 1;
        String[][] shortestPathGrid = new String[GRID_DIMENSION][GRID_DIMENSION];
        for (int i = 0; i < GRID_DIMENSION; i++) {
            for (int j = 0; j < GRID_DIMENSION; j++) {
                shortestPathGrid[i][j] = " ";
            }
        }
        shortestPathGrid[row][column] = String.valueOf(originalGrid[row][column]);
        while (row > 0) {
            // go to minimal
            if (calculatedSumsGrid[row - 1][column] < calculatedSumsGrid[row][column - 1]) {
                // go up
                row--;
                shortestPathGrid[row][column] = String.valueOf(originalGrid[row][column]);
            } else {
                // go left
                column--;
                shortestPathGrid[row][column] = String.valueOf(originalGrid[row][column]);
            }
            // if zero index is achieved then go directly to [0][0] point
            if (row == 0) {
                for (int i = column; i >= 0; i--) {
                    shortestPathGrid[row][i] = String.valueOf(originalGrid[row][i]);
                }
                column = 0;
            } else if (column == 0) {
                for (int j = row; j >= 0; j--) {
                    shortestPathGrid[j][column] = String.valueOf(originalGrid[j][column]);
                }
                row = 0;
            }
        }

        System.out.println("\nSearching minimum-valued path .. ");
        for (int i = 0; i < GRID_DIMENSION; i++) {
            for (int j = 0; j < GRID_DIMENSION; j++) {
                System.out.print(shortestPathGrid[i][j] + " ");
            }
            System.out.println();
        }

    }
}
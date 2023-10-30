import java.util.Arrays;

// Write a Java program to find the minimum path sum in a 2D grid.
// Path from top left to bottom in the right direction which
// minimizes the sum of all numbers along its path.
// Note: Move either down or right at any point in time.
// Sample Output: Sum of all numbers along its path: 13
public class Main {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = (int) Math.round(Math.random() * 9);
            }
        }

        System.out.println("\nGiven grid:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("\nSum of all numbers along its path: %s\n", minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        // Check for invalid or empty input grid
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length; // Number of rows in the grid
        int n = grid[0].length; // Number of columns in the grid
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

        // Return the minimum path sum for the last cell
        return calculatedSumsGrid[m - 1][n - 1];
    }
}
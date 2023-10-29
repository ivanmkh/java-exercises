import java.util.Arrays;

// Write a Java program to find the minimum path sum in a 2D grid.
// Path from top left to bottom in the right direction which
// minimizes the sum of all numbers along its path.
// Note: Move either down or right at any point in time.
// Sample Output: Sum of all numbers along its path: 13
public class Main {
    public static void main(String[] args) {
        int[][] grid1 = {
                {5, 0, 5, 5, 5},
                {5, 0, 5, 5, 5},
                {5, 0, 0, 0, 5},
                {5, 5, 5, 0, 0},
                {5, 5, 5, 5, 5}
        };

        System.out.println("\nGiven grid:");
        for (int[] row : grid1) {
            System.out.println(Arrays.toString(row));
        }

        System.out.printf("\nSum of all numbers along its path: %s\n", getMinimalPath(grid1));

        int[][] grid2 = {
                {7, 4, 2},
                {0, 5, 6},
                {3, 1, 2}
        };

        System.out.println("\nGiven grid:");
        for (int[] row : grid2) {
            System.out.println(Arrays.toString(row));
        }

        System.out.printf("\nSum of all numbers along its path: %s\n", getMinimalPath(grid2));

    }

    public static int getMinimalPath(int[][] grid) {
        int minimalPathSum = 0;

        int row = 0;
        int column = 0;

        while (row < grid.length - 1 || column < grid.length - 1) {

            // finalization
            if (row == grid.length - 1) {
                for (int i = column + 1; i < grid.length; i++) {
                    minimalPathSum += grid[row][i];
                }
                break;
            } else if (column == grid.length - 1) {
                for (int j = row + 1; j < grid.length; j++) {
                    minimalPathSum += grid[j][column];
                }
                break;
            }

            // find minimal number in a column
            int minimalRowNumber = Integer.MAX_VALUE;
            int minimalRowNumberRow = 0;
            for (int i = row + 1; i < grid.length; i++) {
                if (grid[i][column] < minimalRowNumber) {
                    minimalRowNumber = grid[i][column];
                    minimalRowNumberRow = i;
                }
            }
            // find minimal number in a row
            int minimalColumnNumber = Integer.MAX_VALUE;
            int minimalColumnNumberColumn = 0;
            for (int j = column + 1; j < grid.length; j++) {
                if (grid[row][j] < minimalColumnNumber) {
                    minimalColumnNumber = grid[row][j];
                    minimalColumnNumberColumn = j;
                }
            }
            // go to the closest minimal value an calculate sum
            if (minimalRowNumber < minimalColumnNumber) {
                for (int i = row; i < minimalRowNumberRow + 1; i++) {
                    minimalPathSum += grid[i][column];
                }
                row = minimalRowNumberRow;
            } else {
                for (int j = column; j < minimalColumnNumberColumn + 1; j++) {
                    minimalPathSum += grid[row][j];
                }
                column = minimalColumnNumberColumn;
            }
        }

        return minimalPathSum;
    }
}
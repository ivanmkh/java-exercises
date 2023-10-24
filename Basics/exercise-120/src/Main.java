import java.util.Arrays;

// Write a Java program that searches for a value in an m x n matrix.
public class Main {
    public static final int N = 3;
    public static final int M = 5;

    public static void main(String[] args) {
        int searchValue = 4;
        int[][] matrix = new int[M][N];
        boolean isFound = false;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 14 + 1);
            }
        }

        System.out.println("Search value is " + searchValue);
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == searchValue) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        String result = isFound ? "is found" : "is not found";
        System.out.printf("Search valuse %s in the matrix.", result);
    }
}
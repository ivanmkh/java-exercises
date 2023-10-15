import java.util.Arrays;

// Write a Java program to multiply the corresponding elements of two integer arrays.
public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 6, -5};
        int[] array2 = {-5, 5, -1};
        int[] result = new int[3];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
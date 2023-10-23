import java.util.Arrays;

// Write a Java program to create an array left shifted from a given array of integers.
public class Main {
    public static final int L = 2;

    public static void main(String[] args) {
        int[] array = {23, 14, 234, 6, 6, 564, 56, 8, 2, 16, 10, 65, 56, 78, 4, 78, 7, 8, 87, 6, 10, 9, 6, 89};

        System.out.println("The result for array is: " + leftShift(array));
    }

    public static String leftShift(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
        return Arrays.toString(array);
    }
}
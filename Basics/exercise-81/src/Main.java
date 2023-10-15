import java.util.Arrays;

// Write a Java program to swap the first and last elements
// of an array (length must be at least 1) and create another array.
public class Main {
    public static void main(String[] args) {
        int[] array = {54, 6, 346, 34, 46};
        swap(array);
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array) {
        if (array.length < 1) {
            System.out.println("Length of an array must be at least 1");
            return;
        }
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
}
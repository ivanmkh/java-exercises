import java.util.Arrays;

// Write a Java program to rearrange all the elements of a given array of
// integers so that all the odd numbers come before all the even numbers.
public class Main {
    public static void main(String[] args) {
        int[] array = {4, 6, 5, 7};

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                moveToFirst(array, i);
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void moveToFirst(int[] array, int index) {
        for (int i = index; i > 0; i--) {
            swap(array, i, i - 1);
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
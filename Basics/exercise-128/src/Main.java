// Write a Java program to calculate the median of a non-sorted array of integers.
// Original array: [10, 2, 38, 22, 38, 23]
// Median of the said array of integers: 30
// Original array: [10, 2, 38, 23, 38, 23, 21]
// Median of the said array of integers: 23
public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 2, 38, 22, 38, 23};
        int[] array2 = {10, 2, 38, 23, 38, 23, 21};
        System.out.printf("Median element for array1: %d" + System.lineSeparator(), getMedianElement(array1));
        System.out.printf("Median element for array2: %d" + System.lineSeparator(), getMedianElement(array2));
    }

    public static int getMedianElement(int[] array) {
        int middle = array.length / 2;
        int result = array.length % 2 == 0 ? (array[middle] + array[middle - 1]) / 2 : array[middle];
        return result;
    }

}
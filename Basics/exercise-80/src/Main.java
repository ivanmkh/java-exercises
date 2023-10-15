// Write a Java program to get the largest value between the first
// and last elements of an array (length 3) of integers.
public class Main {
    public static void main(String[] args) {
        int[] array = {34, 5, 65};
        int largest = array[0] > array[array.length - 1] ? array[0] : array[array.length - 1];
        System.out.printf("Larger value between first and last element: %d", largest);
    }
}
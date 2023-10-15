import java.util.Arrays;

// Write a Java program to create an array of length 2 from two integer
// arrays with three elements. The newly created array will contain
// the first and last elements from the two arrays.
public class Main {
    public static void main(String[] args) {
        int[] array1 = {43, 54, 6};
        int[] array2 = {4, 7, 34};
        int[] resultArray = new int[2];
        resultArray[0] = array1[0];
        resultArray[1] = array2[array2.length- 1];

        System.out.println(Arrays.toString(resultArray));
    }
}
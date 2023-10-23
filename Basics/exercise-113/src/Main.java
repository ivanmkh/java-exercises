import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to merge two given sorted arrays of integers and create another sorted array.
// array1 = [1,2,3,4]
// array2 = [2,5,7, 8]
// result = [1,2,2,3,4,5,7,8]
public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};

        ArrayList<Integer> mergedArray = new ArrayList<>();
        for (int value : array1) {
            mergedArray.add(value);
        }
        for (int value : array2) {
            mergedArray.add(value);
        }

        System.out.println(Arrays.toString(mergedArray.stream().sorted().toArray()));
    }
}
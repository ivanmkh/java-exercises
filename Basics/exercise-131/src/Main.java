import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.function.IntFunction;

// Write a Java program to find the updated length of a sorted array
// where each element appears only once (remove duplicates).
// Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7] The length of the original array is: 11
// After removing duplicates, the new length of the array is: 7
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int value : array) {
            treeSet.add(value);
        }

        int newLength = treeSet.size();
        int[] newArray = new int[newLength];
        Integer[] newIntegerArray = new Integer[newLength];
        treeSet.toArray(newIntegerArray);
        for (int i = 0; i < newLength; i++) {
            newArray[i] = newIntegerArray[i];
        }

        System.out.printf("Given array: %s \n", Arrays.toString(array));
        System.out.printf("New array: %s \n", Arrays.toString(newArray));
        System.out.printf("New array length is: %d \n", newArray.length);

    }
}
import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to find the updated length of a given sorted
// array where duplicate elements appear at most twice.
// Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
// The length of the original array is: 13
// After removing duplicates, the new length of the array is: 10
public class Main {
    public static final int ALLOWED_APPEARANCE_AMOUNT = 2;
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : array) {
            int valueEncounters = 0;
            for (Integer element : arrayList) {
                if (element == value) {
                    valueEncounters++;
                }
            }
            if (valueEncounters < ALLOWED_APPEARANCE_AMOUNT) {
                arrayList.add(value);
            }
        }
        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrayList.get(i);
        }

        System.out.printf("Original array: %s\n", Arrays.toString(array));
        System.out.printf("New array: %s\n", Arrays.toString(newArray));
        System.out.printf("New array length: %s\n", newArray.length);
    }
}
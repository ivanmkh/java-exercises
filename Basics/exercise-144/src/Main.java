import java.util.ArrayList;

// Write a Java program to remove all occurrences of a specified value in a given array of integers.
// Return the updated array length.
// Sample Output:
// Original array: [1, 4, 6, 7, 6, 2]
// The length of the new array is: 4
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 6, 2};
        int[] newArray = removeElement(array, 6);
        System.out.printf("The length of the new array is: %d", newArray.length);
    }

    public static int[] removeElement(int[] array, int deletingValue) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int element : array) {
            if (element != deletingValue) {
                list.add(element);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
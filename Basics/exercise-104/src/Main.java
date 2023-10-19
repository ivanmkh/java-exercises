import java.util.Arrays;

// Write a Java program to create an array from a given array of integers.
// The newly created array will contain the elements from the given array
// before the last element value of 10.
public class Main {
    public static void main(String[] args) {
        int[] array = {23, 14, 234, 6, 6, 564, 56, 8, 2, 16, 10, 65, 56, 78, 4, 78, 7, 8, 87, 6, 10, 9, 6, 89};
        int lastTenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            lastTenIndex = array[i] == 10 ? i : lastTenIndex;
        }
        int newArrayLength = lastTenIndex;
        int[] newArray = new int[newArrayLength];

        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = array[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
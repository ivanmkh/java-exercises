import java.util.Arrays;

// Write a Java program to create an array from a given array of integers with the following condition:
// the newly created array must contain all elements of the given one that are following a last element
// with value 10 (it can be several of elements with the 10 value).
public class Main {
    public static void main(String[] args) {
        int[] array = {23, 14, 234, 6, 6, 564, 56, 8, 2, 16, 10, 65, 56, 78, 4, 78, 7, 8, 87, 6, 10, 9, 6, 89};
        int lastTenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            lastTenIndex = array[i] == 10 ? i : lastTenIndex;
        }
        int newArrayLength = array.length - lastTenIndex - 1;
        int[] newArray = new int[newArrayLength];

        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = array[i + lastTenIndex + 1];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
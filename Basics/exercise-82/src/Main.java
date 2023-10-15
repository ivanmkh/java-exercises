import java.lang.reflect.Array;
import java.util.Arrays;

// Write a Java program to find the largest element between the first, last,
// and middle values in an array of integers (even length).
public class Main {
    public static void main(String[] args) {
        int[] array = new int[14];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 1000);
        }
        int[] newArray = {
                array[0],
                array[array.length / 2 - 1],
                array[array.length - 1]
        };
        Arrays.sort(newArray);
        int largest = newArray[newArray.length - 1];
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
        System.out.printf("The largest value is %d", largest);
    }
}
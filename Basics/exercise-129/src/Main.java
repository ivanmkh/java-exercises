import java.util.Arrays;

// Write a Java program to find a number that appears only once in a given array of integers.
// All numbers occur twice.
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 50, 20, 10, 20, 30, 40, 40, 30};
        int result = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            boolean condition;
            if (i == 0) {
                condition = array[i] == array[i + 1];
            } else if (i == array.length - 1) {
                condition = array[i - 1] == array[i];
            } else {
                condition = array[i] == array[i + 1] || array[i - 1] == array[i];
            }
            result = condition ? result : array[i];
        }
        System.out.println(result);
    }
}
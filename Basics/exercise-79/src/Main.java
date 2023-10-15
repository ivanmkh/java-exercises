import java.util.Arrays;

// Write a Java program to rotate an array (length 3) of integers in the left direction.
public class Main {
    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        rotateLeft(array);
        System.out.println(Arrays.toString(array));
    }
    public static void rotateLeft(int[] array){
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = temp;
    }
}
// Write a Java program to check if a group of numbers (l) at the start and end of a given array are the same.
public class Main {
    public static final int L = 2;

    public static void main(String[] args) {
        int[] array1 = {23, 14, 234, 6, 6, 564, 56, 8, 2, 16, 10, 65, 56, 78, 4, 78, 7, 8, 87, 6, 10, 9, 6, 89};
        int[] array2 = {23, 14, 234, 6, 6, 564, 56, 8, 2, 16, 10, 65, 56, 78, 4, 78, 7, 8, 87, 6, 10, 9, 23, 14};

        System.out.println("The result for array1 is: " + checkArray(array1));
        System.out.println("The result for array2 is: " + checkArray(array2));
    }

    public static boolean checkArray(int[] array) {
        return array[0] == array[array.length - 2] && array[1] == array[array.length - 1];
    }
}
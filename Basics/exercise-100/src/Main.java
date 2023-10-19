// Write a Java program to count the elements that differ by 1 or
// less between two given arrays of integers with the same length.
public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {20, 23, 20, 244, 20, 6};
        int[] arrayTwo = {21, 22, 20, 244, 21, 7};

        System.out.printf("The comparison result of arrayOne and arrayTwo is %b \n", checkArray(arrayOne, arrayTwo));
    }

    public static boolean checkArray(int[] array1, int[] array2) {
        boolean result = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i] && Math.abs(array1[i] - array2[i]) > 1) {
                result = false;
            }
        }
        return result;
    }
}
// Write a Java program to check if a specified array of integers contains 10 or 30.
public class Main {
    public static void main(String[] args) {
        int[] array = {20, 23, 20, 244, 20, 6, 10, 34, 23, 34, 10, 3, 7, 6, 46, 10, 34, 43, 10};

        System.out.printf("The result is %b \n", checkArray(array));
    }

    public static boolean checkArray(int[] array) {
        int tensCounter = 0;
        int thirtiesCounter = 0;

        for (int i = 0; i < array.length; i++) {
            tensCounter = array[i] == 10 ? ++tensCounter : tensCounter;
            thirtiesCounter = array[i] == 30 ? ++thirtiesCounter : thirtiesCounter;
        }

        return tensCounter > 0 || thirtiesCounter > 0;
    }
}
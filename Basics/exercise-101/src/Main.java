// Check if there are more elements that equals 10 than 20 in a given array of integers
public class Main {
    public static void main(String[] args) {
        int[] array = {20, 23, 20, 244, 20, 6, 10, 34, 23, 34, 10, 3, 7, 6, 46, 10, 34, 43, 10};

        System.out.printf("The result is %b \n", checkArray(array));
    }

    public static boolean checkArray(int[] array) {
        int tensCounter = 0;
        int twentiesCounter = 0;

        for (int i = 0; i < array.length; i++) {
            tensCounter = array[i] == 10 ? ++tensCounter : tensCounter;
            twentiesCounter = array[i] == 20 ? ++twentiesCounter : twentiesCounter;
        }

        return tensCounter > twentiesCounter;
    }
}
import java.util.Arrays;

// Write a Java program to test if an array of integers contains an
// element 10 next to 10 or an element 20 next to 20, but not both.
public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {34, 45, 346, 76, 10, 5345, 24, 5, 53, 20, 20};
        int[] arrayTwo = {34, 45, 346, 76, 10, 10, 24, 5, 53, 20, 233};
        int[] arrayThree = {34, 45, 346, 76, 10, 10, 24, 5, 53, 20, 20};

        System.out.printf("Check arrayOne: %b" + System.lineSeparator(), checkNumbers(arrayOne));
        System.out.printf("Check arrayTwo: %b" + System.lineSeparator(), checkNumbers(arrayTwo));
        System.out.printf("Check arrayThree: %b" + System.lineSeparator(), checkNumbers(arrayThree));

    }

    public static boolean checkNumbers(int[] array) {
        boolean isTenNextToTen = false;
        boolean isTwentyNextToTwenty = false;

        if (array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            isTenNextToTen = !isTenNextToTen ?
                    array[i] == 10 && array[i + 1] == 10 : isTenNextToTen;
            isTwentyNextToTwenty = !isTwentyNextToTwenty ?
                    array[i] == 20 && array[i + 1] == 20 : isTwentyNextToTwenty;
        }

        return (isTenNextToTen || isTwentyNextToTwenty) && !(isTenNextToTen && isTwentyNextToTwenty);
    }
}
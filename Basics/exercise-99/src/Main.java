// Write a Java program that checks if a specified number appears
// in every pair of adjacent integers of a given array of integers.
public class Main {

    public static final int SPEC_NUMBER = 20;

    public static void main(String[] args) {
        System.out.println("Specified number: " + SPEC_NUMBER);

        int[] numberIsFirst = {20, 23, 20, 244, 20, 6};
        int[] numberIsSecond = {43, 20, 20, 20, 43, 20};
        int[] theTimesNextToEachOther = {20, 20, 3, 20, 54, 6};
        int[] zeroTime = {43, 23, 3, 5, 54, 6};

        System.out.printf("Result for numberIsFirst is %b \n", checkArray(numberIsFirst, SPEC_NUMBER));
        System.out.printf("Result for numberIsSecond is %b \n", checkArray(numberIsSecond, SPEC_NUMBER));
        System.out.printf("Result for theTimesNextToEachOther is %b \n", checkArray(theTimesNextToEachOther, SPEC_NUMBER));
        System.out.printf("Result for zeroTime is %b \n", checkArray(zeroTime, SPEC_NUMBER));
    }

    public static boolean checkArray(int[] array, int number) {
        boolean result = true;
        int startIndex = array[0] == number ? 0 : 1;
        for (int i = startIndex; i < array.length; i = i + 2) {
            if (array[i] != number) {
                result = false;
            }
        }
        return result;
    }
}
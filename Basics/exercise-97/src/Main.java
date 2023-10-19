// Write a Java program to check if an array of integers contains a specified number
// next to each other or two same numbers separated by one element.
public class Main {

    public static final int SPEC_NUMBER = 10;
    public static void main(String[] args) {
        System.out.println("Specified number: " + SPEC_NUMBER);

        int[] twoSeparatedNumber = {10, 23, 10, 244, 54, 6};
        int[] twoNumberTogether = {43, 10, 10, 244, 54, 6};
        int[] oneNumber = {43, 23, 3, 10, 54, 6};
        int[] noNumber = {43, 23, 3, 5, 54, 6};

        System.out.printf("Result for twoSeparatedNumber is %b \n", checkArray(twoSeparatedNumber, SPEC_NUMBER));
        System.out.printf("Result for twoNumberTogether is %b \n", checkArray(twoNumberTogether, SPEC_NUMBER));
        System.out.printf("Result for oneNumber is %b \n", checkArray(oneNumber, SPEC_NUMBER));
        System.out.printf("Result for noNumber is %b \n", checkArray(noNumber, SPEC_NUMBER));
    }

    public static boolean checkArray(int[] array, int number) {
        for (int i = 0; i < array.length - 2; i++) {
            if ((array[i] == number) && (array[i + 1] == number || array[i + 2] == number)) {
                return true;
            }
        }
        return false;
    }
}
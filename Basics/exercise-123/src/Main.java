import java.util.Arrays;

// Write a Java program to find the sub array with the smallest sum from a given array of integers.
public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(arrayOfNumbers));
        findSubarray(arrayOfNumbers);

        System.out.println(System.lineSeparator());

        int[] arrayOfNumbers2 = {-2, 1, -3, 4};
        System.out.println(Arrays.toString(arrayOfNumbers2));
        findSubarray(arrayOfNumbers2);
    }

    private static void findSubarray(int[] arrayOfNumbers) {
        int beginIndex = 0;
        int endIndex = 0;
        int minSum = 0;
        int sum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i; j < arrayOfNumbers.length; j++) {
                sum += arrayOfNumbers[j];
                if (sum < minSum) {
                    beginIndex = i;
                    endIndex = j;
                    minSum = sum;
                }
            }
            sum = 0;
        }

        System.out.printf("Min sum: %d.\nBegin element: %d\nEnd element: %d", minSum, beginIndex, endIndex);
    }
}
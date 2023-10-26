// Write a Java program to find a contiguous subarray with the largest sum from a given array of integers.
// Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray
// within a one-dimensional array of numbers which has the largest sum. For example,
// for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4;
// the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6.
// The subarray should contain one integer at least.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(arrayOfNumbers));
        findSubarray(arrayOfNumbers);

        System.out.println(System.lineSeparator());

        int[] arrayOfNumbers2 = {-2, -1, -3, 4, 6, 2, -1, -5, 4};
        System.out.println(Arrays.toString(arrayOfNumbers2));
        findSubarray(arrayOfNumbers2);
    }

    private static void findSubarray(int[] arrayOfNumbers) {
        int beginIndex = 0;
        int endIndex = 0;
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i; j < arrayOfNumbers.length; j++) {
                sum += arrayOfNumbers[j];
                if (sum > maxSum) {
                    beginIndex = i;
                    endIndex = j;
                    maxSum = sum;
                }
            }
            sum = 0;
        }

        System.out.printf("Max sum: %d.\nBegin element: %d\nEnd element: %d", maxSum, beginIndex, endIndex);
    }
}
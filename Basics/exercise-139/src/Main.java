// Write a Java program to get the index of the first and the last number
// of a subarray where the sum of numbers is zero.
// Original Array : [1, 2, 3, -6, 5, 4]
// Index of the subarray of the given array where the sum of numbers is zero: [0, 3]
public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, -6, 5, 4};
        int[] array2 = {5, 6, -2, 0, 2, 4, 3};
        System.out.println("Result for array1: " + getSubarray(array1));
        System.out.println("Result for array2: " + getSubarray(array2));
    }

    public static String getSubarray(int[] array) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            start = i;
            sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                end = j;
                if (sum == 0 && start != end) {
                    result.append(String.format("[%d, %d]", start, end));
                    break;
                }
            }
        }
        return result.toString();
    }
}
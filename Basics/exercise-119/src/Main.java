// Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.
public class Main {
    public static void main(String[] args) {
        int[] array = {123, 532, 6, 5, 6, 4765, 7657, 657, 658, 5, 8587, 75, 8, 7};
        int searchNumber = 5;
        int firstOccuranceIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                firstOccuranceIndex = i;
            }
        }

        System.out.printf("First occurance of %d is %d", searchNumber, firstOccuranceIndex);
    }
}
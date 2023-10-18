import java.util.ArrayList;
import java.util.Arrays;

// Write a Java program to rearrange all the elements of a given array of
// integers so that all the odd numbers come before all the even numbers.
public class Main {
    public static void main(String[] args) {
        int[] array = {4, 65, 345, 7, 34, 7, 234, 345, 42, 8};
        int[] resultArray = new int[array.length];
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        for (int number : array) {
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }

        for (int i = 0; i < odds.size(); i++){
            resultArray[i] = odds.get(i);
        }

        // TODO .. finish task later

        System.out.println(Arrays.toString(resultArray));

    }
}
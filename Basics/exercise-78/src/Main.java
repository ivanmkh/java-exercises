// Write a Java program to test that a given array of
// integers of length 2 contains a 4 or a 7.
public class Main {
    public static void main(String[] args) {
        int[] array = {34, 5};
        boolean result = false;
        for (int number : array) {
            if (number == 4 || number == 7) {
                result = true;
            }
        }
        System.out.println(result);
    }
}
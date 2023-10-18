import java.util.Scanner;

// Write a Java program to check if there is a 10 in an
// array of integers with a 20 somewhere later on.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input numbers separated with space: ");
        String userInput = new Scanner(System.in).nextLine();
        String[] rawArray = userInput.split("[ ]+");
        int[] array = new int[rawArray.length];
        StringBuilder checkResult = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(rawArray[i]);
        }

        for (int s : array) {
            if (s == 10 || s == 20) {
                checkResult.append(s);
            }
        }

        if (checkResult.toString().contains("1020")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
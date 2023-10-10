import java.util.Scanner;

// Write a Java program that accepts three integer values and
// returns true if one is 20 or more less than the others' subtractions.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input number1: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input number2: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.print("Input number3: ");
        int number3 = new Scanner(System.in).nextInt();

        boolean result = Math.abs(number1 - number2) >= 20 ||
                Math.abs(number2 - number3) >= 20 ||
                Math.abs(number3 - number1) >= 20;

        System.out.println(result);
    }
}
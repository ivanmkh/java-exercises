import java.util.Scanner;

// Write a Java program to accept an integer and count the factors of the number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = new Scanner(System.in).nextInt();
        int factorsCounter = 0;
        for (int i = 1; i<=number; i++) {
            if (number % i == 0) {
                factorsCounter++;
            }
        }
        System.out.println(factorsCounter);
    }
}
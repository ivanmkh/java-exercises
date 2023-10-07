import java.util.Scanner;

// Write a Java program that accepts three integers from the user. It returns true if
// the second number is higher than the first number and the third number is larger
// than the second number. If "abc" is true, the second number does not need
// to be larger than the first number.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Input the second number: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.print("Input the third number : ");
        int number3 = new Scanner(System.in).nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println(true);
        }
    }
}
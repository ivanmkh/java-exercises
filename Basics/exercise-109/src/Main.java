import java.util.Scanner;

// Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a number of coins: ");
        int coinsNumber = new Scanner(System.in).nextInt();
        int rowNumber = 1;
        while (coinsNumber > 0) {
            for (int i = 0; i < rowNumber && coinsNumber > 0; i++) {
                System.out.print("$");
                coinsNumber--;
            }
            rowNumber++;
            System.out.println();
        }
    }
}
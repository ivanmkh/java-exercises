import java.util.Scanner;

// Write a Java program to print the area and perimeter of a circle.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input a radius: ");
        double radius = new Scanner(System.in).nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Ther perimeter is %.2f", perimeter);
    }
}
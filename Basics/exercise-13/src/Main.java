import java.util.Scanner;

// Write a Java program to print the area and perimeter of a rectangle.
public class Main {
    public static void main(String[] args) {
        System.out.print("Input width of a rectangle: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Input height of a rectangle: ");
        double height = new Scanner(System.in).nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println(String.format("The area is %.2f and the perimeter is %.2f", area, perimeter));
    }
}
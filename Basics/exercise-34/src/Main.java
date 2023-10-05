import java.util.Scanner;

// Write a Java program to compute hexagon area.
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
// where s is the length of a side
public class Main {
    public static void main(String[] args) {
        System.out.print("Input the length of a side: ");
        double sideLength = new Scanner(System.in).nextDouble();

        double area = (6 * Math.pow(sideLength, 2f))/(4*Math.tan(Math.PI/6));

        System.out.printf("The area is %.2f", area);
    }
}
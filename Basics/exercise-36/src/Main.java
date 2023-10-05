import java.util.Scanner;

// Write a Java program to compute the distance between two points on the earth's surface.
// Distance between the two points [ (x1,y1) & (x2,y2)]
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Radius of the earth r = 6371.01 Kilometers
public class Main {

    public static final double EARTH_RADIUS = 6371.01f;

    public static void main(String[] args) {
        System.out.print("Input x1: ");
        double x1 = new Scanner(System.in).nextDouble();
        System.out.print("Input y1: ");
        double y1 = new Scanner(System.in).nextDouble();

        System.out.print("Input x2: ");
        double x2 = new Scanner(System.in).nextDouble();
        System.out.print("Input y2: ");
        double y2 = new Scanner(System.in).nextDouble();

        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

        double d = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.printf("The distance between two points on the earth's surface is %.2f", d);
    }
}
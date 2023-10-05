import java.util.Scanner;

// Write a Java program to compute the area of a polygon.
// Area of a polygon = (n*s^2)/(4*tan(π/n))
// where n is n-sided polygon and s is the length of a side
public class Main {
    public static void main(String[] args) {
        System.out.print("Input the number of sides: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Input the length of a side: ");
        double s = new Scanner(System.in).nextInt();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area of a polygon is %.2f", area);
    }
}
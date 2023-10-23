// Write a Java program to add two numbers without arithmetic operators.
// Given x = 10 and y = 12; result = 22
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: " + x);
        System.out.print("\n");
    }
}
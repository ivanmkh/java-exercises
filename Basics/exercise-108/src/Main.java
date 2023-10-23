// Write a Java program to add all the digits of a given
// positive integer until the result has a single digit.
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 2134;
        char[] digitsToCharArray;
        while (number / 10 > 0) {
            digitsToCharArray = String.valueOf(number).toCharArray();
            for (char ch : digitsToCharArray) {
                sum += Integer.parseInt(String.valueOf(ch));
            }
            number = sum;
            sum = 0;
        }

        System.out.println(number);
    }
}
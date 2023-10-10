// Write a Java program to compute the sum of the first 100 prime numbers.
public class Main {
    public static void main(String[] args) {
        int primeSum = 0;
        int primeCounter = 100;
        int number = 0;

        while (primeCounter > 0) {
            if (isPrime(++number)) {
                primeCounter--;
                primeSum += number;
            }
        }

        System.out.printf(" %s", primeSum);
    }

    public static boolean isPrime(int number) {
        int factorsCounter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsCounter++;
            }
        }

        return Boolean.valueOf(factorsCounter == 2);
    }
}
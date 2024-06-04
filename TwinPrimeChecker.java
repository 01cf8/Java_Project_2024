import java.util.Scanner;

public class TwinPrimeChecker {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int c = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check if two numbers are twin prime
    public static boolean areTwinPrimes(int num1, int num2) {
        return (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the input numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Check if the numbers are twin primes
        if (areTwinPrimes(number1, number2)) {
            System.out.println("(" + number1 + "," + number2 + ") are twin prime numbers.");
        } else {
            System.out.println("(" + number1 + "," + number2 + ") are not twin prime numbers.");
        }

        scanner.close();
    }
}
